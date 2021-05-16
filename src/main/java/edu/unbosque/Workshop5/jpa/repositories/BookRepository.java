package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Book;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Optional<Book> findById(Integer id);
    List<Book> findByIdAuthor();

    Optional<Book> findByTitle(String title);

    Optional<Book> findByNameNamedQuery(String title);

    List<Book> findAll();

    Optional<Book> save(Book book);

    void deleteByTitle(String title);

    void deleteById(Integer id);

    void updateById(Integer id, String title, String isbn_number, String genre);

}
