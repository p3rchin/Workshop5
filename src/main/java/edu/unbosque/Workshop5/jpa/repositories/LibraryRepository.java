package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.entities.Library;

import java.util.List;
import java.util.Optional;

public interface LibraryRepository {

    Optional<Library> findById(Integer id);

    List<Library> findAll();

    Optional<Library> save(Library library);

    void deleteById(Integer id);

    void updateById(Integer id, String name);

}
