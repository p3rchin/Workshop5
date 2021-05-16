package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.AuthorService;
import edu.unbosque.Workshop5.services.LibraryService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteLibraryServlet", value = "/delete-library")
public class DeleteLibraryServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer libraryId = Integer.parseInt(request.getParameter("libraryId"));

        LibraryService libraryService = new LibraryService();
        libraryService.deleteLibrary(libraryId);

        response.sendRedirect("./index.jsp");
    }
}
