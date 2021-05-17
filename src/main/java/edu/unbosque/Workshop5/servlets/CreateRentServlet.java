package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.jpa.entities.Customer;
import edu.unbosque.Workshop5.jpa.repositories.CustomerRepository;
import edu.unbosque.Workshop5.services.EditionService;
import edu.unbosque.Workshop5.services.RentService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cretateRentServlet", value = "/create-rent")
public class CreateRentServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String email = request.getParameter("email");
        String date = request.getParameter("date");
        Integer editionId = Integer.parseInt(request.getParameter("editionId"));
        RentService rentService = new RentService();
        rentService.saveRent(editionId, date, email);
        response.sendRedirect("./index.jsp");

    }
}
