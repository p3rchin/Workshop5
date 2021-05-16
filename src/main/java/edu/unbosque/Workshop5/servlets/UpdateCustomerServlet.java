package edu.unbosque.Workshop5.servlets;

import edu.unbosque.Workshop5.services.AuthorService;
import edu.unbosque.Workshop5.services.CustomerService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateCustomerServlet", value = "/update-customer")
public class UpdateCustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String email = request.getParameter("email");
        String firtsName = request.getParameter("firtsName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        Integer age = Integer.parseInt(request.getParameter("age"));

        CustomerService customerService = new CustomerService();
        customerService.updateCustomer(email, firtsName, lastName, gender, age);

        response.sendRedirect("./index.jsp");
    }
}
