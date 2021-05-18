package edu.unbosque.Workshop5.servlets.pojos;


public class RentPOJO {

    private Integer rentId;

    private String email;

    private String date;

    public RentPOJO(Integer rentId, String date) {
        this.rentId = rentId;
        this.date = date;
    }

    public RentPOJO(Integer rentId, String email, String date) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
