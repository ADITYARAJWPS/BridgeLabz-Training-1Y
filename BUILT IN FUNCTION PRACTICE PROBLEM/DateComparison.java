import java.time.LocalDate;

class DateComparison {
    public String compareDates(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        if (date1.isBefore(date2)) {
            return "BEFORE";
        } else if (date1.isAfter(date2)) {
            return "AFTER";
        } else {
            return "SAME";
        }
    }
}