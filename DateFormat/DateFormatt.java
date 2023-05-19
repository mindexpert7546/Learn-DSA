import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatt {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/mm/yyyy");
        String stringDate = dateFor.format(date);
        System.out.println(stringDate);

    }
}
