import java.time.LocalDate;

class DateArithmetic {
    public String calculateDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate);

        LocalDate result = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        return result.toString();
    }
}