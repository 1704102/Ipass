package Application.Model;

import java.util.StringTokenizer;

/**
 * Created by marti on 21-5-2017.
 */
public class Worker {

    private static String voornaam;
    private static String achternaam;
    private static String gbDatum;
    private static String aangenomen;
    private static String email;


    public static String getVoornaam() {
        return voornaam;
    }

    public static void setVoornaam(String voornaam) {
        Worker.voornaam = voornaam;
    }

    public static String getAchternaam() {
        return achternaam;
    }

    public static void setAchternaam(String achternaam) {
        Worker.achternaam = achternaam;
    }

    public static String getGbDatum() {
        return gbDatum;
    }

    public static void setGbDatum(String gbDatum) {
        Worker.gbDatum = gbDatum;
    }

    public static String getAangenomen() {
        return aangenomen;
    }

    public static void setAangenomen(String aangenomen) {
        Worker.aangenomen = aangenomen;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Worker.email = email;
    }
}
