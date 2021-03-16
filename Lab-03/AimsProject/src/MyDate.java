import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	
	public MyDate() {
        Calendar calen = Calendar.getInstance();
        this.day = calen.get(Calendar.DAY_OF_MONTH);
        this.month = calen.get(Calendar.MONTH);
        this.year = calen.get(Calendar.YEAR);
    }

	public MyDate(int day, int month, int year) {
		if((day >=1 && day <=31) || (month >=1 && month <= 12) || (year >= 0))
		{
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else
        {
            if(!(day >=1 && day <= getDaysofMonth(month, year)))
                System.out.println("Invalid day!!!");
            if(!(month >=1 && month <= 12))
                System.out.println("Invalid month!!!");
            if (year < 0)
                System.out.println("Invalid year!!!");
        }
	}
	
	public MyDate(String date) {
        String part[] = date.split("/");
        this.day = Integer.parseInt(part[0]);
        this.month = Integer.parseInt(part[1]);;
        this.year = Integer.parseInt(part[2]);
        
    }
	
	public int getDaysofMonth(int month, int year) {
	     
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
	        return 31;
		}
	    else if (month == 2 ) 
	    {
	    	if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0))
	    	{
	    		return 29;
	    	}
	    	else
	    	{
	    		return 28;
	    	}
	    }
	    else
	    {
	        return 30;
	    }
	}
	
	public int getDay()
	{
		return day;
	}
	public void setDay(int day)
	{
		if(day >= 1 && day <= getDaysofMonth(month,year))
		{
			this.day = day;
		}
        else 
        {
            System.out.println("Invalid ay!!!");
        }
	}
	public int getMonth()
	{
		return month;
	}
	public void setMonth(int month)
	{
		if(month >=1 && month <=12)
		{
            this.month = month;
		}
        else {
            System.out.println("Invalid month.");
        }
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		if(year > 0)
		{
            this.year = year;
		}
        else {
            System.out.println("Invalid year!!!");
        }
	}
	
	public String validDate() {    
        if(this.year < 0) {
            return "Invalid year";
        }else if (this.month < 1 || this.month > 12) {
            return "Invalid month";
        }else if (this.day < 1 || this.day > 31) {
            return "Invalid day";
        }else if (this.day > this.getDaysofMonth(month, year)) {
            return "Month " + this.month + " don't have " + this.day + " days";
        }else
            return "Not error";
    }

    public void accept() {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter dd mm yyyy");
        String date = input.nextLine();
        String part[] = date.split(" ");
        this.day = Integer.parseInt(part[0]);
        this.month = Integer.parseInt(part[1]);;
        this.year = Integer.parseInt(part[2]);
        input.close();
    }

    public void print() {
        if(this.validDate().equals("Not error")){
        	System.out.println("My Date (format: dd mm yyyy): ");
        	System.out.println(day + " " + month + " " + year);
        }
        else {
            System.out.println(this.validDate());
        }
    }

}
