package tech.ada.poo.base.hackathon;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainRogerio {

    public static void main(String[] args) {
        System.out.println( data("99/09/2024") );
    }

    public static boolean data(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(data);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

}
