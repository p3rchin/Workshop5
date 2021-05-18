package edu.unbosque.Workshop5.servlets.pojos;


import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class RentPOJO {

    private Integer rentId;

    private String email;

    private Date date;

    public RentPOJO(Integer rentId, Date date) {
        this.rentId = rentId;
        this.date = date;
    }

    public RentPOJO(Integer rentId, String email, Date date) {
        this.rentId = rentId;
        this.email = email;
        this.date = date;
    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
