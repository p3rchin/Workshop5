package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.*;
import edu.unbosque.Workshop5.jpa.repositories.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class RentService {

    CustomerRepository customerRepository;
    EditionRepository editionRepository;
    RentRepository rentRepository;

    public void saveRent(Integer editionId, String date, String email) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        customerRepository = new CustomerRepositoryImpl(entityManager);
        editionRepository = new EditionRepositoryImpl(entityManager);
        rentRepository = new RentRepositoryImpl(entityManager);

        Optional<Customer> customer = customerRepository.findByEmail(email);
        Edition edition = editionRepository.findById2(editionId);
        customer.ifPresent(a -> {
            a.addRent(new Rent(edition, date));
            customerRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();

        return;

    }
}
