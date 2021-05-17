package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.EditionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateEditionServlet", value = "/update-edition")
public class UpdateEditionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer editionId = Integer.parseInt(request.getParameter("editionId"));
        String description = request.getParameter("description");
        String date = request.getParameter("date");

        EditionService editionService = new EditionService();
        editionService.updateEditionById(editionId, description, date);

        response.sendRedirect("./index.jsp");
    }
}
