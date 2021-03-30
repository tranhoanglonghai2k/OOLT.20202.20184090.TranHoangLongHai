package Date;

public class DateTest {
    public static void main(String[] args) throws Exception {
       MyDate test = new MyDate("19", "Jun", "two thousand and six");
		test.print();
        test.printFormat();
    }
}