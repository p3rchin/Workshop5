package edu.unbosque.Workshop5.servlets.pojos;


import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class RentPOJO {

    private Integer rentId;

    private String email;

    private LocalDate date;

    private String date1;

    public RentPOJO(Integer rentId, LocalDate date) {
        this.rentId = rentId;
        this.date = date;

    }

    public RentPOJO(Integer rentId, String date1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        this.rentId = rentId;
        this.date1 = formatter.format(date);
    }

    public RentPOJO(Integer rentId, String email, LocalDate date) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
