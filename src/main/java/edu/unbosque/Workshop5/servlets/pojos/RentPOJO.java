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

    private Integer year;

    private Integer month;

    private Integer day;

    public RentPOJO(Integer rentId, LocalDate date) {
        this.rentId = rentId;
        this.date = date;

    }


    public RentPOJO(Integer rentId, String email, Integer year, Integer month, Integer day) {
        this.rentId = rentId;
        this.email = email;
        this.year = year;
        this.month = month;
        this.day = day;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
