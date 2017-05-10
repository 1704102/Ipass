package Application.Database;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by marti on 10-5-2017.
 */
public class LoginDatabase extends DatabaseHelper{

    public boolean checkLogin(String username, String password){
        if(username.equals("") || password.equals("")){
            System.out.println("false");
            return false;
        }else {
            connect();
            ResultSet s = select("select * from werknemers");

            try {
                while (s.next()){
                    if (username.equals(s.getString("email"))){
                        if (password.equals(s.getString("wachtwoord"))){
                            System.out.println("true");
                            return true;
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } disconnect();
        }
        System.out.println("false");
        return false;
    }
}
