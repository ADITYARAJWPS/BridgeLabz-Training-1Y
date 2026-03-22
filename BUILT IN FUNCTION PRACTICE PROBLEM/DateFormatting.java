 import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class DateFormatting {
    public List<String> formatDate() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        List<String> result = new ArrayList<>();
        result.add(today.format(f1));
        result.add(today.format(f2));
        result.add(today.format(f3));

        return result;
    }
}