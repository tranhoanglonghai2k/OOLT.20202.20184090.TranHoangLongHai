package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.*;
import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) throws Exception {
       MyDate test = new MyDate("19", "Jun", "two thousand and six");
		test.print();
        test.printFormat();
    }
}
