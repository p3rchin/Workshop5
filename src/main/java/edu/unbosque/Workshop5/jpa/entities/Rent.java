package edu.unbosque.Workshop5.jpa.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Rent") // Optional
@NamedQueries({
        @NamedQuery(name = "Rent.findByRentId",
                query = "SELECT a FROM Author a WHERE a.name = :name")
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
    private Date renting_date;
    @ManyToOne
    private Edition editionRent;
    public Rent(){

    }

    public Rent(Integer rent_id, Customer customer, Edition edition, Date renting_date) {
        this.rent_id = rent_id;
        this.customer = customer;
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

    public Edition getEditionRent() {
        return editionRent;
    }

    public void setEditionRent(Edition editionRent) {
        this.editionRent = editionRent;
    }

    public Date getRenting_date() {
        return renting_date;
    }

    public void setRenting_date(Date renting_date) {
        this.renting_date = renting_date;
    }
}