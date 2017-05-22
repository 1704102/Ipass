package Application.Database;

import Application.Model.Worker;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by marti on 22-5-2017.
 */
public class UserDatabase extends DatabaseHelper{

    public void setUser(String user){
        connect();
        ResultSet r = select(String.format("select * from werknemers where username = '%s'",user));
        try {
            while (r.next()){
                Worker.setVoornaam(r.getString("voornaam"));
                Worker.setAchternaam(r.getString("achternaam"));
                Worker.setGbDatum(r.getString("geboortedatum"));
                Worker.setAangenomen(r.getString("aangenomen"));
                Worker.setEmail(r.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
    }
}
