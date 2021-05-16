package edu.unbosque.Workshop5.servlets;

import com.google.gson.Gson;
import edu.unbosque.Workshop5.services.BookService;
import edu.unbosque.Workshop5.services.CustomerService;
import edu.unbosque.Workshop5.servlets.pojos.BookPOJO;
import edu.unbosque.Workshop5.servlets.pojos.CustomerPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listBooksServlet", value = "/list-books")
public class ListBooksServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        BookService bookService = new BookService();
        List<BookPOJO> books =  bookService.listBooks();
//        Integer authorId = Integer.parseInt(request.getParameter("authorId"));
//        System.out.println(authorId);
//        String authorsJsonString = "";
//        for (int i = 0; i < books.size(); i++) {
//            if(authorId == books.get(i).getAuthorId()){
        String   authorsJsonString = new Gson().toJson(books);
//            }
//        }
        PrintWriter out = response.getWriter();
        out.print(authorsJsonString);
        out.flush();

    }
}
