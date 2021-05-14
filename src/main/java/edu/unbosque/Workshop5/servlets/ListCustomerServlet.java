package edu.unbosque.Workshop5.servlets;

import com.google.gson.Gson;
import edu.unbosque.Workshop5.services.AuthorService;
import edu.unbosque.Workshop5.services.CustomerService;
import edu.unbosque.Workshop5.servlets.pojos.AuthorPOJO;
import edu.unbosque.Workshop5.servlets.pojos.CustomerPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listCustomersServlet", value = "/list-customers")
public class ListCustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        CustomerService customerService = new CustomerService();
        List<CustomerPOJO> customers =  customerService.listCustomers();

        String authorsJsonString = new Gson().toJson(customers);

        PrintWriter out = response.getWriter();
        out.print(authorsJsonString);
        out.flush();

    }
}
