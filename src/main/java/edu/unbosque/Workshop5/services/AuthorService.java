package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.repositories.AuthorRepository;
import edu.unbosque.Workshop5.jpa.repositories.AuthorRepositoryImpl;
import edu.unbosque.Workshop5.servlets.pojos.AuthorPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class AuthorService {

    AuthorRepository authorRepository;

    public List<AuthorPOJO> listAuthors() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        authorRepository = new AuthorRepositoryImpl(entityManager);
        List<Author> authors = authorRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<AuthorPOJO> authorsPOJO = new ArrayList<>();
        for (Author author : authors) {
            authorsPOJO.add(new AuthorPOJO(
                    author.getAuthorId(),
                    author.getName(),
                    author.getBooks().size()
            ));
        }

        return authorsPOJO;

    }

    public Author saveAuthor(String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        authorRepository = new AuthorRepositoryImpl(entityManager);

        Author author = new Author(name);
        Author persistedAuthor = authorRepository.save(author).get();

        entityManager.close();

        return persistedAuthor;

    }

}