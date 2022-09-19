package interview.probs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Date;

public class DateProblem {
    public static void main(String[] args) {
        String date = "2021-05-03";
        getDate(date);

        int a = 1234567890;
        System.out.println(a);
    }
    public static void getDate(String date) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        Date d = null;
        try {
            d = form.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DayOfWeek day = DayOfWeek.of(d.getDay());
        System.out.println(day.name());
    }
}
