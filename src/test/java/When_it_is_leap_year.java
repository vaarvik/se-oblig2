import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;

public class When_it_is_leap_year {

    private static Stream<Arguments> fourButNotHundreds(){
        return Stream.of(
                of(true, 4),
                of(true, 16),
                of(false, 100),
                of(false, 300)
        );
    }

    @ParameterizedTest()
    @MethodSource("fourButNotHundreds")
    public void leap_years_are_divisible_by_four_but_not_by_100 (boolean expected, int input) {
        Assertions.assertEquals(expected, Program.isLeapYear(input));
    }

    private static Stream<Arguments> fourHundreds(){
        return Stream.of(
            of(true, 400),
            of(true, 1200),
            of(true, 2000)
        );
    }

    @ParameterizedTest()
    @MethodSource("fourHundreds")
    public void leap_years_are_divisible_by_four_hundred(boolean expected, int input) {
        Assertions.assertEquals(expected, Program.isLeapYear(input));
    }

    private static Stream<Arguments> notFour(){
        return Stream.of(
                of(false, 10),
                of(false, 19),
                of(false, 101)
        );
    }
    @ParameterizedTest()
    @MethodSource("notFour")
    public void leap_years_are_not_divisible_by_four(boolean expected, int input) {
        Assertions.assertEquals(expected, Program.isLeapYear(input));
    }

    private static Stream<Arguments> fourHundredsButNotHundreds(){
        return Stream.of(
                of(true, 400),
                of(false, 1000),
                of(false, 1700),
                of(false, 1800),
                of(false, 1900),
                of(true, 2000),
                of(false, 2100)
        );
    }

    @ParameterizedTest()
    @MethodSource("fourHundredsButNotHundreds")
    public void leap_years_are_divisible_by_four_hundreds_but_not_hundreds(boolean expected, int input) {
        Assertions.assertEquals(expected, Program.isLeapYear(input));
    }

    private static Stream<Arguments> fourThousands(){
        return Stream.of(
            of(false, 4000),
            of(false, 12000)
        );
    }

    @ParameterizedTest()
    @MethodSource("fourThousands")
    public void leap_years_are_not_divisible_by_four_thousands(boolean expected, int input) {
        Assertions.assertEquals(expected, Program.isLeapYear(input));
    }
}
