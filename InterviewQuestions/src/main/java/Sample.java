
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Sample {
    public static void main(String[] args) {
        String angle = "1234567890";

        StringBuffer buffer = new StringBuffer(angle);

        System.out.println(buffer.deleteCharAt(4));

        DecimalFormat df = new DecimalFormat("#.00");
        String angleFormated = df.format(Double.valueOf(angle));
        System.out.println(angleFormated);
        System.out.println(angleFormated.length());
       // sample();
    }
    public static Timestamp getTimestamp(Date date) {
        return new Timestamp(date.getTime());
    }

    public static void sample()
    {
        LocalDate programmersDay = LocalDate.of(2019, 9, 13);
        LocalDate today = LocalDate.now();
        String message = "Happy Programmers’ Day!";
        String from = "Wirecard";
        if (today.isEqual(programmersDay)) {
            System.out.format("%s, %s", message, from);
        }
    }
}
