package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.*;
import edu.unbosque.Workshop5.jpa.repositories.*;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.RentPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;

@Stateless
public class RentService {

    CustomerRepository customerRepository;
    EditionRepository editionRepository;
    RentRepository rentRepository;

    public List<RentPOJO> listRentsByCustomer(String email, Integer year, Integer month, Integer day, Integer year2, Integer month2, Integer day2) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        rentRepository = new RentRepositoryImpl(entityManager);
        List<Rent> rents = rentRepository.findByCustomer(email, year, month, day, year2 , month2, day2 );

        entityManager.close();
        entityManagerFactory.close();

        List<RentPOJO> rentsPOJO = new ArrayList<>();
        for (Rent rent : rents) {
            rentsPOJO.add(new RentPOJO(
                    rent.getRent_id(),
                    rent.getCustomer().getEmail(),
                    rent.getRenting_date().getYear(),
                    rent.getRenting_date().getMonthValue(),
                    rent.getRenting_date().getDayOfMonth()
            ));
        }

        return rentsPOJO;

    }

    public List<RentPOJO> listRents() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        rentRepository = new RentRepositoryImpl(entityManager);
        List<Rent> rents = rentRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<RentPOJO> rentsPOJO = new ArrayList<>();
        for (Rent rent : rents) {
            rentsPOJO.add(new RentPOJO(
                    rent.getRent_id(),
                    rent.getRenting_date()
            ));
        }

        return rentsPOJO;

    }

    public void saveRent(Integer editionId, LocalDate date, String email) {

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

    public void deleteRent(Integer id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        rentRepository = new RentRepositoryImpl(entityManager);
        rentRepository.deleteById(id);

        entityManager.close();
        entityManagerFactory.close();

    }
}
