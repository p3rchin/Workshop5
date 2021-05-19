package edu.unbosque.Workshop5.jpa.repositories;

import edu.unbosque.Workshop5.jpa.entities.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class RentRepositoryImpl implements RentRepository{

    private EntityManager entityManager;

    public RentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Rent> findById(Integer id) {
        Rent rent = entityManager.find(Rent.class, id);
        return rent != null ? Optional.of(rent) : Optional.empty();
    }

    @Override
    public List<Rent> findAll() {
        return entityManager.createQuery("from Rent").getResultList();
    }

    @Override
    public List<Rent> findByCustomer(String email, Integer year, Integer month, Integer day, Integer year2, Integer month2, Integer day2) {
        String date1 = year + "-" + month + "-" + day;
        String date2 = year2 + "-" + month2 + "-" + day2;

        String QUERY = "from Rent where customer = '" +  email + "'" + "and renting_date >= '" + date1 + "'" + "and renting_date <= '" + date2 +"'" ;
        String QUERY2 = "from Rent where customer = '" +  email + "'";
        String date = "from Rent where customer =:email";
        entityManager.createQuery(QUERY).getResultList();

        return entityManager.createQuery(QUERY).getResultList();
    }

    @Override
    public Optional<Rent> save(Rent rent) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(rent);
            entityManager.getTransaction().commit();
            return Optional.of(rent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        Rent rent = entityManager.find(Rent.class, id);
        if (rent != null) {
            try {
                Customer customer = rent.getCustomer();
                Edition edition = rent.getEdition();
                customer.deleteRent(rent);
                edition.deleteRent(rent);
                entityManager.getTransaction().begin();
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
