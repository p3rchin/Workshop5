package edu.unbosque.Workshop5.servlets;

import com.google.gson.Gson;
import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.EditionService;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.EditionPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listEditionsServlet", value = "/list-editions")
public class ListEditionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        EditionService editionService = new EditionService();
        List<EditionPOJO> editions = editionService.listBooks();
//        Integer authorId = Integer.parseInt(request.getParameter("authorId"));
//        System.out.println(authorId);
//        String authorsJsonString = "";
//        for (int i = 0; i < books.size(); i++) {
//            if(authorId == books.get(i).getAuthorId()){
        String   editionsJsonString = new Gson().toJson(editions);
//            }
//        }
        PrintWriter out = response.getWriter();
        out.print(editionsJsonString);
        out.flush();

    }
}
