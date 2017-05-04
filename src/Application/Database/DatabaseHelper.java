package Application.Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by marti on 20-1-2017.
 */
public class DatabaseHelper {



    Connection connection;
    public void connect() {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");;
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipass","root","klbxjmpv526f");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet select(String query){
        connect();
        ResultSet r = null;
        try {
            Statement s = connection.createStatement();
            r = s.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    public void delete(String query){
        connect();
        Statement s = null;
        try {
            s = connection.createStatement();
            s.execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        disconnect();
    }

    public void insert(String query){
        try {
            Statement s = connection.createStatement();
            System.out.println(query);
            s.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disconnect(){
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
