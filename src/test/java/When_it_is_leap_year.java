import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;

public class When_it_is_leap_year {

    private static Stream<Arguments> yearStream(){
        return Stream.of(
                of(true, 4),
                of(false, 10),
                of(false, 100),
                of(true, 104),
                of(false, 200),
                of(false, 300),
                of(true, 400),
                of(false, 1000),
                of(false, 1700),
                of(false, 1800),
                of(false, 1900),
                of(true, 2000),
                of(true, 2004),
                of(false, 2100),
                of(false, 4000),
                of(true, 8004),
                of(true, 7048),
                of(false, 12000)
        );
    }

    @ParameterizedTest()
    @MethodSource("yearStream")
    public void check_years(boolean expected, int input) {
        Assertions.assertEquals(expected, Program.isLeapYear(input));
    }
}
