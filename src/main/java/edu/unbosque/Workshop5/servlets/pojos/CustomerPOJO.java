package edu.unbosque.Workshop5.servlets.pojos;

public class CustomerPOJO {

    private String email;
    private String firtsName;
    private String lastName;
    private String gender;
    private Integer age;
    private Integer numeroRentas;

    public CustomerPOJO(String email, String firtsName, String lastName, String gender, Integer age, Integer numeroRentas) {
        this.email = email;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.numeroRentas = numeroRentas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumeroRentas() {
        return numeroRentas;
    }

    public void setNumeroRentas(Integer numeroRentas) {
        this.numeroRentas = numeroRentas;
    }
}
