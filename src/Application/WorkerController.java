package Application;

import Application.Database.ReserveringDatabase;
import Application.Model.Worker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by marti on 21-5-2017.
 */
public class WorkerController extends HttpServlet {

    private static Worker worker;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("het");
    }

    public static void createWorker(String name){
        worker = new Worker(name);
    }

    public static Worker getWorker(){
        return worker;
    }
}
