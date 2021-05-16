package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Book;
import edu.unbosque.Workshop5.jpa.entities.Edition;

import java.util.List;
import java.util.Optional;

public interface EditionRepository {

    Optional<Edition> findById(Integer id);

    List<Edition> findAll();

    Optional<Edition> save(Edition edition);
}
