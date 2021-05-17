package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.EditionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteEditionServlet", value = "/delete-edition")
public class DeleteEditionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer id = Integer.parseInt(request.getParameter("editionId"));
        System.out.println(id);
        EditionService editionService = new EditionService();
        editionService.deleteEdition(id);

        response.sendRedirect("./index.jsp");
    }
}
