package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.AuthorService;
import edu.unbosque.Workshop5.services.CustomerService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cretateCustomerServlet", value = "/create-customer")
public class CreateCustomersServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String email = request.getParameter("email");
        String firtsName = request.getParameter("firtsName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");

        CustomerService customerService = new CustomerService();
        customerService.saveCustomer(email,firtsName, lastName, gender, Integer.parseInt(age));

        response.sendRedirect("./index.jsp");
    }
}
