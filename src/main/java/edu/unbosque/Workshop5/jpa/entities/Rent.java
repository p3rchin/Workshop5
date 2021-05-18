package edu.unbosque.Workshop5.jpa.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Rent") // Optional
@NamedQueries({
        @NamedQuery(name = "Rent.findByRentId",
                query = "SELECT a FROM Rent a WHERE a.renting_date = :renting_date")
})
public class Rent {
    @Id
    @GeneratedValue
    @Column(name = "rent_id")
    private Integer rent_id;
    @ManyToOne
    @JoinColumn(name = "email_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "edition_id")
    private Edition edition;
    @Column(name = "renting_date")
    private String renting_date;

    public Rent(){

    }

    public Rent(Integer rent_id, Customer customer, Edition edition, String renting_date) {
        this.rent_id = rent_id;
        this.customer = customer;
        this.edition = edition;
        this.renting_date = renting_date;
    }

    public Rent(String renting_date) {
        this.renting_date = renting_date;
    }

    public Rent(Edition edition, String renting_date) {
        this.edition = edition;
        this.renting_date = renting_date;
    }

    public Integer getRent_id() {
        return rent_id;
    }

    public void setRent_id(Integer rent_id) {
        this.rent_id = rent_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public String getRenting_date() {
        return renting_date;
    }

    public void setRenting_date(String renting_date) {
        this.renting_date = renting_date;
    }
}
