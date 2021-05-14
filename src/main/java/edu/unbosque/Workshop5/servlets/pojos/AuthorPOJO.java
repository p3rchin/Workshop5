package edu.unbosque.Workshop5.servlets.pojos;

public class AuthorPOJO {

    private Integer authorId;

    private String name;

    private Integer numBooks;

    private String country;

    public AuthorPOJO() { }

    public AuthorPOJO(Integer authorId, String name, Integer numBooks, String country) {
        this.authorId = authorId;
        this.name = name;
        this.numBooks = numBooks;
        this.country = country;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumBooks() {
        return numBooks;
    }

    public void setNumBooks(Integer numBooks) {
        this.numBooks = numBooks;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
