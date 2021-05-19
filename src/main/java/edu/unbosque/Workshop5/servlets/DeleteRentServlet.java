package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.RentService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteRentServlet", value = "/delete-rent")
public class DeleteRentServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer id = Integer.parseInt(request.getParameter("rentId"));

        RentService rentService = new RentService();
        rentService.deleteRent(id);

        response.sendRedirect("./index.jsp");
    }
}
