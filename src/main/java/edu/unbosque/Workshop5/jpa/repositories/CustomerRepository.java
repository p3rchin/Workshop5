package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    Optional<Customer>findByEmail(String email);

    List<Customer> findAll();

    Optional<Customer> save(Customer customer);
}
