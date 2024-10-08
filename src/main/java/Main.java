import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public void main(String[] args) {
        System.out.println( data("09/09/2024") );
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
