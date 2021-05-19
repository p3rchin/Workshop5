package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.Library;
import edu.unbosque.Workshop5.jpa.repositories.AuthorRepositoryImpl;
import edu.unbosque.Workshop5.jpa.repositories.EditionRepositoryImpl;
import edu.unbosque.Workshop5.jpa.repositories.LibraryRepository;
import edu.unbosque.Workshop5.jpa.repositories.LibraryRepositoryImpl;

import edu.unbosque.Workshop5.servlets.pojos.LibraryPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class LibraryService {

    LibraryRepository libraryRepository;

    public List<LibraryPOJO> listLibraries() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);
        List<Library> libraries = libraryRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<LibraryPOJO> librariesPOJO = new ArrayList<>();
        for (Library library : libraries) {
            librariesPOJO.add(new LibraryPOJO(
                    library.getLibraryId(),
                    library.getName()
            ));
        }

        return librariesPOJO;

    }

    public void saveLibrary(String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);

        Library library = new Library(name);
        Library persistedLibrary = libraryRepository.save(library).get();

        entityManager.close();
        entityManagerFactory.close();

        return;

    }

    public void deleteLibrary(Integer libraryId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);
        libraryRepository.deleteById(libraryId);

        entityManager.close();
        entityManagerFactory.close();

    }

    public void deleteEdition(Integer libraryId) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);

        libraryRepository.deleteEditionById(libraryId);

        entityManager.close();
        entityManagerFactory.close();
    }

    public void updateLibraryById(Integer authorId, String name){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);
        libraryRepository.updateById(authorId, name);
        entityManager.close();
        entityManagerFactory.close();
    }

}
