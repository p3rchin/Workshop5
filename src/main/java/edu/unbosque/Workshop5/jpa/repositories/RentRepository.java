package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.entities.Customer;
import edu.unbosque.Workshop5.jpa.entities.Rent;

import java.util.List;
import java.util.Optional;

public interface RentRepository {

    Optional<Rent> findById(Integer id);

    List<Rent> findAll();

    List<Rent> findByCustomer(String email, Integer year, Integer month, Integer day, Integer year2, Integer month2, Integer day2);

    Optional<Rent> save(Rent rent);

    void deleteById(Integer id);

}
