package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.jpa.entities.Book;
import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.EditionService;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "cretateBookServlet", value = "/create-book")
public class CreateBookServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        String title = request.getParameter("title");
        String isbn = request.getParameter("isbn");
        Integer authorId = Integer.parseInt(request.getParameter("authorId"));
        String genre = request.getParameter("genre");

        String descripcion = request.getParameter("description");
        String year = request.getParameter("date");
        BookService bookService = new BookService();
        EditionService editionService = new EditionService();
        bookService.saveBook(title, isbn, authorId, genre);

        List<BookPOJO> books =  bookService.listBooks();
        BookPOJO book =  books.get(books.size() -1 );
        Integer bookId = book.getBook_id();

        editionService.saveEdition(descripcion, year, bookId);
        response.sendRedirect("./index.jsp");

    }

}
