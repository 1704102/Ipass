package Application;

/**
 * Created by marti on 10-5-2017.
 */


import Application.Database.LoginDatabase;
import Application.Database.ReserveringDatabase;
import Application.Database.UserDatabase;
import Application.Model.Worker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by marti on 1-5-2017.
 */
@WebServlet("/loginC.jsp")
public class LoginController extends HttpServlet {

    LoginDatabase database = new LoginDatabase();
    UserDatabase database2 = new UserDatabase();
    static boolean logged = false;
    static Worker worker;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("start");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(database.checkLogin(username, password)){
            PrintWriter out = response.getWriter();
            worker = new Worker();
            database2.setUser(username);
            out.print("<script language='JavaScript'>parent.window.location = \"werknemer.html\";;</script>");
        }else{
            request.getRequestDispatcher("/login.jsp").include(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public static boolean logged(){
        return logged;
    }

}
