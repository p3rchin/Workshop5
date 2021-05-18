package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.entities.Book;
import edu.unbosque.Workshop5.jpa.entities.Customer;
import edu.unbosque.Workshop5.jpa.repositories.*;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.CustomerPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Stateless
public class BookService {

    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public List<BookPOJO> listBooks() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        bookRepository = new BookRepositoryImpl(entityManager);
        List<Book> books = bookRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<BookPOJO> booksPOJO = new ArrayList<>();
        for (Book book : books) {
            booksPOJO.add(new BookPOJO(
                    book.getBookId(),
                    book.getTitle(),
                    book.getIsbn(),
                    book.getGenre(),
                    book.getEditions().size()
            ));
        }

        return booksPOJO;

    }
    public List<BookPOJO> listBooks(Integer id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        bookRepository = new BookRepositoryImpl(entityManager);
        List<Book> books = bookRepository.findByIdAuthor(id);

        entityManager.close();
        entityManagerFactory.close();

        List<BookPOJO> booksPOJO = new ArrayList<>();
        for (Book book : books) {
            booksPOJO.add(new BookPOJO(
                    book.getBookId(),
                    book.getTitle(),
                    book.getIsbn(),
                    book.getGenre(),
                    book.getEditions().size()
            ));
        }

        return booksPOJO;

    }
    public void saveBook(String title, String isbn, Integer authorId, String genre) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        authorRepository = new AuthorRepositoryImpl(entityManager);
        bookRepository = new BookRepositoryImpl(entityManager);


        Optional<Author> author = authorRepository.findById(authorId);
        author.ifPresent(a -> {
            a.addBook(new Book(title, isbn, genre));
            authorRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();

        return;

    }

    public void deleteBook(Integer id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        bookRepository = new BookRepositoryImpl(entityManager);
        bookRepository.deleteById(id);

        entityManager.close();
        entityManagerFactory.close();

    }

    public void updateBookById(Integer id, String title, String isbn_number, String genre){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        bookRepository = new BookRepositoryImpl(entityManager);
        bookRepository.updateById(id, title, isbn_number, genre);

        entityManager.close();
        entityManagerFactory.close();
    }

}
