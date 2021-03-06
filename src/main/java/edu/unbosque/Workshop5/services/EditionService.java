package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.entities.Book;
import edu.unbosque.Workshop5.jpa.entities.Edition;
import edu.unbosque.Workshop5.jpa.entities.Library;
import edu.unbosque.Workshop5.jpa.repositories.*;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.EditionPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Stateless
public class EditionService {

    BookRepository bookRepository;

    EditionRepository editionRepository;

    LibraryRepository libraryRepository;

    public List<EditionPOJO> listBooks() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        List<Edition> editions = editionRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<EditionPOJO> editionsPOJO = new ArrayList<>();
        for (Edition edition : editions) {
            editionsPOJO.add(new EditionPOJO(
                    edition.getEditionId(),
                    edition.getDescription(),
                    edition.getReleaseYear()

            ));
        }

        return editionsPOJO;

    }

    public void saveLibrary(Integer editionId, Integer libraryId){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        libraryRepository = new LibraryRepositoryImpl(entityManager);

        Edition edition = editionRepository.findById2(editionId);
        Library library = libraryRepository.findById2(libraryId);
        edition.addLibrary(library);

        editionRepository.save(edition);

        entityManager.close();
        entityManagerFactory.close();
    }

    public void saveEdition(String description, String year, Integer book_id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        bookRepository = new BookRepositoryImpl(entityManager);
        editionRepository = new EditionRepositoryImpl(entityManager);


        Optional<Book> book = bookRepository.findById(book_id);
        book.ifPresent(a -> {
            a.addEdition(new Edition(description, year));
            bookRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();

        return;

    }

    public void deleteEdition(Integer id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        editionRepository.deleteById(id);

        entityManager.close();
        entityManagerFactory.close();

    }

    public void deleteLibrary(Integer libraryId){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        libraryRepository = new LibraryRepositoryImpl(entityManager);

//        libraryRepository.deleteEditionById(libraryId);
        editionRepository.deleteLibraryById(libraryId);

        entityManager.close();
        entityManagerFactory.close();
    }

    public void updateEditionById(Integer id, String description, String year){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        editionRepository.updateById(id, description, year);

        entityManager.close();
        entityManagerFactory.close();
    }
}
