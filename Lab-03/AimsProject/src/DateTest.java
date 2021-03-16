
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate("19/10/2000");
		date1.print();
		MyDate date2 = new MyDate(19,9,2006);
		date2.print(); 
		MyDate date3 = new MyDate();
		date3.setDay(11);
		date3.setMonth(2);
		date3.setYear(1976);
		date3.print();
		MyDate date4 = new MyDate();
		date4.accept();
		date4.print();
	}

}
