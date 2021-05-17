package edu.unbosque.Workshop5.servlets.pojos;

import javax.persistence.criteria.CriteriaBuilder;

public class BookPOJO {

    private Integer authorId;

    private Integer book_id;

    private String title;

    private String ibsn_number;

    private String genre;

    private Integer numeroEdiciones;


    public BookPOJO(){

    }

    public BookPOJO(Integer book_id, String title, String ibsn_number, String genre, Integer numeroEdiciones) {
        this.book_id = book_id;
        this.title = title;
        this.ibsn_number = ibsn_number;
        this.genre = genre;
        this.numeroEdiciones = numeroEdiciones;

    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIbsn_number() {
        return ibsn_number;
    }

    public void setIbsn_number(String ibsn_number) {
        this.ibsn_number = ibsn_number;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNumeroEdiciones() {
        return numeroEdiciones;
    }

    public void setNumeroEdiciones(Integer numeroEdiciones) {
        this.numeroEdiciones = numeroEdiciones;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
