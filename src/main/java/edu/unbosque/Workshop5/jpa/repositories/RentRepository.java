package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Rent;

import java.util.Optional;

public interface RentRepository {

    Optional<Rent> findById(Integer id);

    Optional<Rent> save(Rent rent);

}
