package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.AuthorService;
import edu.unbosque.Workshop5.services.BookService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateBookServlet", value = "/update-book")
public class UpdateBookServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer bookId = Integer.parseInt(request.getParameter("bookId"));
        String title = request.getParameter("title");
        String isbn = request.getParameter("isbn");
        String genre = request.getParameter("genre");

        BookService bookService = new BookService();
        bookService.updateBookById(bookId, title, isbn, genre);

        response.sendRedirect("./index.jsp");
    }
}
