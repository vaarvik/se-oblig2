public class Program {
    public static void main(String[] args) {
    }

    public static Boolean isLeapYear(Integer year){
        return year % 4 == 0 && year % 100 != 0;
    }
}
