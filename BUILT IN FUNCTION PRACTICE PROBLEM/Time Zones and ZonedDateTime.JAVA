import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.*;

class  Time Zones and ZonedDateTime {
    public List<String> getTimes() {
        List<String> result = new ArrayList<>();

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        result.add("GMT: " + gmt.toString());
        result.add("IST: " + ist.toString());
        result.add("PST: " + pst.toString());

        return result;
    }
}