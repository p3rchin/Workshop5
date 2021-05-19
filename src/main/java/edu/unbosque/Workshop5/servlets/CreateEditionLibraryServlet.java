package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.EditionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cretateEditionLibraryServlet", value = "/create-editionLibrary")
public class CreateEditionLibraryServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");


        Integer editionId = Integer.parseInt(request.getParameter("editionId"));
        Integer libraryId = Integer.parseInt(request.getParameter("libraryId"));
        EditionService editionService = new EditionService();
        editionService.saveLibrary(editionId, libraryId);
        response.sendRedirect("./index.jsp");

    }
}
