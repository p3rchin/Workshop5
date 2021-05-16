package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Book;
import edu.unbosque.Workshop5.jpa.entities.Edition;

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
    public List<Edition> findAll() {
        return entityManager.createQuery("from Book").getResultList();
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
}
