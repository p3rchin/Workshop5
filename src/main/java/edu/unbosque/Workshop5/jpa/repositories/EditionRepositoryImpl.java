package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class EditionRepositoryImpl implements EditionRepository{
    private EntityManager entityManager;

    public EditionRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Optional<Edition> findById(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        return edition != null ? Optional.of(edition) : Optional.empty();
    }

    @Override
    public Edition findById2(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        return edition;
    }

    @Override
    public List<Edition> findAll() {
        return entityManager.createQuery("from Edition ").getResultList();
    }

    @Override
    public Optional<Edition> save(Edition edition) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(edition);
            entityManager.getTransaction().commit();
            return Optional.of(edition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        if (edition != null) {
            try {
                Book book = edition.getBook();
                book.deleteEdition(edition);
                entityManager.getTransaction().begin();

                edition.getRents().forEach(rent -> {
                    entityManager.remove(rent);
                });

                entityManager.remove(edition);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteLibraryById(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        if (edition != null) {
            try {
                entityManager.getTransaction().begin();
                edition.getLibraries().forEach(library -> {
                    library.getEditions().remove(edition);
                });
                entityManager.remove(edition);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateById(Integer id, String description, String year) {
        Edition edition = entityManager.find(Edition.class, id);
        if (edition != null) {
            try {
                entityManager.getTransaction().begin();
                edition.setDescription(description);
                edition.setReleaseYear(year);
                entityManager.merge(edition);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
