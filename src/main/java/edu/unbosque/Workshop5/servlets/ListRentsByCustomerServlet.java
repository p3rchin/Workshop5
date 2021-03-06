package edu.unbosque.Workshop5.servlets;

import com.google.gson.Gson;
import edu.unbosque.Workshop5.services.RentService;
import edu.unbosque.Workshop5.servlets.pojos.RentPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "listRentCustomerServlet", value = "/list-rentsCustomer")
public class ListRentsByCustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        String d1 = request.getParameter("date1");
        String d2 = request.getParameter("date2");

        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        RentService rentService = new RentService();
        List<RentPOJO> rents =  rentService.listRentsByCustomer(email, date1.getYear(), date1.getMonthValue(), date1.getDayOfMonth(),date2.getYear(), date2.getMonthValue(), date2.getDayOfMonth());
        String rentsJsonString = new Gson().toJson(rents);
        PrintWriter out = response.getWriter();
        out.print(rentsJsonString);
        out.flush();

    }
}
