import java.util.Scanner;
public class TheNumofDaysofaMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Days = 0;
		
		System.out.println("Enter a year: ");
		int Year = input.nextInt();
		while (Year <= 0)
		{
			System.out.println("Please Enter a year: ");
			Year = input.nextInt();
		}
		System.out.println("Nhập tháng mà bạn muốn: ");
		String Month = input.next();

		if (Month.equals("January") || Month.equals("Jan.") || Month.equals("Jan") || Month.equals("1"))
		{
			Days = 31;
		}
		else if (Month.equals("February") || Month.equals("Feb.") || Month.equals("Feb") || Month.equals("2"))
		{
			if (Year % 400 == 0 || (Year % 4 == 0) && (Year % 100 != 0))
				Days = 29;
			else
				Days = 28;
		}
		else if (Month.equals("March") || Month.equals("Mar.") || Month.equals("Mar") || Month.equals("3"))
		{
			Days = 31;
		}
		else if (Month.equals("April") || Month.equals("Apr.") || Month.equals("Apr") || Month.equals("4"))
		{
			Days = 30;
		}
		else if (Month.equals("May") || Month.equals("5"))
		{
			Days = 31;
		}
		else if (Month.equals("June") || Month.equals("Jun.") || Month.equals("Jun") || Month.equals("6"))
		{
			Days = 30;
		}
		else if (Month.equals("July") || Month.equals("Jul.") || Month.equals("Jul") || Month.equals("7"))
		{
			Days = 31;
		}
		else if (Month.equals("August") || Month.equals("Aug.") || Month.equals("Aug") || Month.equals("8"))
		{
			Days = 31;
		}
		else if (Month.equals("September") || Month.equals("Sep.") || Month.equals("Sep") || Month.equals("9"))
		{
			Days = 30;
		}
		else if (Month.equals("October") || Month.equals("Oct.") || Month.equals("Oct") || Month.equals("10"))
		{
			Days = 31;
		}
		else if (Month.equals("November") || Month.equals("Nov.") || Month.equals("Nov") || Month.equals("11"))
		{
			Days = 30;
		}
		else if (Month.equals("December") || Month.equals("Dec.") || Month.equals("Dec") || Month.equals("12"))
		{
			Days = 31;
		}
		
		System.out.println(Year + "/" + Month + " has" + Days + " days.");
		input.close();
	}
}
