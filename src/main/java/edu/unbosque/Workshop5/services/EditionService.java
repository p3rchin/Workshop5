package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.entities.Book;
import edu.unbosque.Workshop5.jpa.entities.Edition;
import edu.unbosque.Workshop5.jpa.repositories.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Year;
import java.util.Date;
import java.util.Optional;

@Stateless
public class EditionService {

    BookRepository bookRepository;

    EditionRepository editionRepository;

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
}
