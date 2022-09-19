import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Settlementdate {

    public static void main(String[] args) {
      /* String date= getDateTimeConversionToExpectedTimezone( ZoneId.of("Asia/Singapore"), ZoneId.of("Australia/Sydney"),2019,"0510","000000");
        System.out.println(date);*/
        checkAESTnAEDT();
    }
    public static String getDateTimeConversionToExpectedTimezone(ZoneId sourceTz, ZoneId targetTz, int yyyy, String mmdd, String hhmmss) {

       // LocalDateTime  localDateTime = LocalDateTime.of(2019, Month.JANUARY,05,00,00,00);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String time1 = "20190105120000";
        LocalDateTime localDateTime = LocalDateTime.parse(time1, formatter);
        ZonedDateTime zonedDt = ZonedDateTime.of(localDateTime, sourceTz);
        zonedDt = zonedDt.withZoneSameInstant(targetTz);

        return zonedDt.format(formatter);
    }

    public static void checkAESTnAEDT()
    {
        TimeZone fromZone = TimeZone.getTimeZone("Asia/Singapore");
        TimeZone toZone = TimeZone.getTimeZone("Australia/Sydney");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(fromZone);
        calendar.setTime(new Date());
        calendar.add(Calendar.MILLISECOND, toZone.getRawOffset());

        if (toZone.inDaylightTime(calendar.getTime())) {
            calendar.add(Calendar.MILLISECOND, toZone.getDSTSavings());
        }

        System.out.println(calendar.getTime());
    }
}
