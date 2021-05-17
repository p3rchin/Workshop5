package edu.unbosque.Workshop5.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Book") // Optional
@NamedQueries({
        @NamedQuery(name = "Book.findByTitle",
                query = "SELECT b FROM Book b WHERE b.title = :title"),
        @NamedQuery(name = "Book.findAll",
                query = "SELECT b FROM Book b")
})
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Integer bookId;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(name = "isbn_number")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "genre")
    private String genre;

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Edition> editions = new ArrayList<>();

    public Book() {}


    public Book(String title, String isbn, String genre) {
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public List<Edition> getEditions() {
        return editions;
    }

    public void addEdition(Edition edition) {
        editions.add(edition);
        edition.setBook(this);
    }

    public void deleteEdition(Edition edition){
        editions.remove(edition);
        edition.setBook(null);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
