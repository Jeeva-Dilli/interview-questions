import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UTCTimeZone {
    public static void main(String[] args) {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        String date = utc.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
        Timestamp timestamp = Timestamp.valueOf(date);
        //System.out.println("DATETIME = " + utc.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(timestamp);
        System.out.println(check());

    }

    private static boolean check()
    {
        String s=null;
        return "SUCCESS".equals(s);
    }
}
