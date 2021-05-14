package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.AuthorService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cretateAuthorServlet", value = "/create-author")
public class CreateAuthorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");
        String country = request.getParameter("country");

        AuthorService authorService = new AuthorService();
        authorService.saveAuthor(name, country);

        response.sendRedirect("./index.jsp");
    }

}
