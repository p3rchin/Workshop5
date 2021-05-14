package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.Customer;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class CustomerRepositoryImpl implements CustomerRepository{

    private EntityManager entityManager;

    public CustomerRepositoryImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public Optional<Customer> findByEmail(String email) {
        Customer customer = entityManager.find(Customer.class, email);
        return customer != null ? Optional.of(customer) : Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return entityManager.createQuery("from Customer ").getResultList();
    }

    @Override
    public Optional<Customer> save(Customer customer) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
            return Optional.of(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
