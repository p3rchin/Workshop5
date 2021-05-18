package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.*;
import edu.unbosque.Workshop5.jpa.repositories.*;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.RentPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateless
public class RentService {

    CustomerRepository customerRepository;
    EditionRepository editionRepository;
    RentRepository rentRepository;

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

    public void saveRent(Integer editionId, String date, String email) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        customerRepository = new CustomerRepositoryImpl(entityManager);
        editionRepository = new EditionRepositoryImpl(entityManager);
        rentRepository = new RentRepositoryImpl(entityManager);

        Optional<Customer> customer = customerRepository.findByEmail(email);
        Optional<Edition> edition1 = editionRepository.findById(editionId);
        Edition edition = editionRepository.findById2(editionId);

//        customer.ifPresent(a -> {
//            a.addRent(new Rent(edition, date));
//            customerRepository.save(a);
//        });

        customer.ifPresent(a -> {
            a.addRent(new Rent(date));
            customerRepository.save(a);
        });

        edition1.ifPresent(a -> {
            a.addRent(new Rent(date));
            editionRepository.save(a);
        });


        entityManager.close();
        entityManagerFactory.close();

        return;

    }
}
