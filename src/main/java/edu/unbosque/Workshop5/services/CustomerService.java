package edu.unbosque.Workshop5.services;

import edu.unbosque.Workshop5.jpa.entities.Author;
import edu.unbosque.Workshop5.jpa.entities.Customer;
import edu.unbosque.Workshop5.jpa.repositories.AuthorRepositoryImpl;
import edu.unbosque.Workshop5.jpa.repositories.CustomerRepository;
import edu.unbosque.Workshop5.jpa.repositories.CustomerRepositoryImpl;
import edu.unbosque.Workshop5.servlets.pojos.CustomerPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CustomerService {

    private CustomerRepository customerRepository;

    public List<CustomerPOJO> listCustomers() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        customerRepository = new CustomerRepositoryImpl(entityManager);
        List<Customer> customers = customerRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<CustomerPOJO> customersPOJO = new ArrayList<>();
        for (Customer customer : customers) {
            customersPOJO.add(new CustomerPOJO(
                    customer.getEmail(),
                    customer.getFirts_name(),
                    customer.getLast_name(),
                    customer.getGender(),
                    customer.getAge(),
                    customer.getRents().size()
            ));
        }

        return customersPOJO;

    }

    public Customer saveCustomer(String email, String firtsName, String lastName, String gender, Integer age) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        customerRepository = new CustomerRepositoryImpl(entityManager);

        Customer customer = new Customer(email,firtsName, lastName, gender, age);

        Customer persistedCustomer = customerRepository.save(customer).get();

        entityManager.close();

        return persistedCustomer;

    }

    public void deleteCustomer(String email){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        customerRepository = new CustomerRepositoryImpl(entityManager);
        customerRepository.deleteByEmail(email);

        entityManager.close();
        entityManagerFactory.close();
    }
}
