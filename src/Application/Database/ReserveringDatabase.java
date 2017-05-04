package Application.Database;

/**
 * Created by marti on 4-5-2017.
 */
public class ReserveringDatabase extends DatabaseHelper{

    public void inserReservering(String name, String surName, String email, String personen, String date, String time){
        String date1 = "STR_TO_DATE('" + date + " " + time + "','%m-%d-%Y %H:%i:%s')";
        System.out.println(date1);
//        insert(String.format("insert into Reserveringen (voornaam, achternaam, email, personen, datum) values (\"%s\",\"%s\",\"%s\",\"%d\",\"%s\")",
//                name, surName, email, Integer.parseInt(personen), date1));
    }
}
