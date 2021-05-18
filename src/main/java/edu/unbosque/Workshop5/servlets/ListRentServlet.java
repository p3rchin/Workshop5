package edu.unbosque.Workshop5.servlets;

import com.google.gson.Gson;
import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.RentService;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.RentPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listRentServlet", value = "/list-rents")
public class ListRentServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        RentService rentService = new RentService();
        List<RentPOJO> rents =  rentService.listRents();

        String rentsJsonString = new Gson().toJson(rents);
        PrintWriter out = response.getWriter();
        out.print(rentsJsonString);
        out.flush();

    }
}
