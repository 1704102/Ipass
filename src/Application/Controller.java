package Application;

import Application.Database.DatabaseHelper;
import Application.Database.ReserveringDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static sun.plugin.javascript.navig.JSType.Location;


/**
 * Created by marti on 1-5-2017.
 */
@WebServlet("/reservering.jsp")
public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("test");
        String name = request.getParameter("voornaam");
        String surname = request.getParameter("achternaam");
        String email = request.getParameter("email");
        String personen = request.getParameter("personen");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        request.getRequestDispatcher("/Reserveren.jsp").include(request, response);
        if(name.equals("") || surname.equals("") || email.equals("")){
            System.out.println("incorrect information dial");PrintWriter out = response.getWriter();
            out.println("<div style=\"margin: auto; width: 200px; color: red;\">incorrect summary</div>");
        }else{
            ReserveringDatabase database = new ReserveringDatabase();
            database.connect();
            database.inserReservering(name, surname, email, personen, date, time);
            database.disconnect();

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("het");
    }

}
