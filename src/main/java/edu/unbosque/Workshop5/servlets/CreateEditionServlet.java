package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.EditionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "cretateEditionServlet", value = "/create-edition")
public class CreateEditionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String description = request.getParameter("description");
        String year = request.getParameter("date");

        String bookId = request.getParameter("bookId");
        System.out.println(bookId);
        EditionService editionService = new EditionService();
        editionService.saveEdition(description, year, Integer.parseInt(bookId));

        response.sendRedirect("./index.jsp");
    }
}
