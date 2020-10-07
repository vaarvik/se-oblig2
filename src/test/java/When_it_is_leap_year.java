import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class When_it_is_leap_year {
    @Test
    public void check_years() {
        final int leapYear = 104;
        Assertions.assertTrue(Program.isLeapYear(leapYear));
    }
}
