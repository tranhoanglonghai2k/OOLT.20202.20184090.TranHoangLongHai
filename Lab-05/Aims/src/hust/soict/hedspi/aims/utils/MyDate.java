package hust.soict.hedspi.aims.utils;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class MyDate {
	private int day;
	private int month;
	private int year;
	
	static String[][] dayStr = {
	        {"first", "1"}, {"second", "2"}, {"third", "3"}, {"fourth", "4"}, {"fifth", "5"},
	        {"sixth", "6"}, {"seventh", "7"}, {"eighth", "8"}, {"ninth", "9"}, {"tenth", "10"},
	        {"eleventh", "11"}, {"twelfth", "12"}, {"thirteenth", "13"}, {"fouterteenth", "14"},
	        {"fifteenth", "15"}, {"sixteenth", "16"}, {"seventeeth", "17"}, {"eighteenth", "18"},
	        {"nineteenth", "19"},{"twentieth", "20"}, {"twenty-first", "21"},{"twenty-second", "22"},
	        {"twenty-third", "23"}, {"twenty-fourth", "24"}, {"twenty-fifth", "25"}, {"twenty-sixth", "26"},
	        {"twenty-seventh", "27"}, {"twenty-eighth", "28"}, {"twenty-ninth", "29"},{"thirtieth", "30"},{"thirty-first", "31"},
	    };
	static String[] monthStr = {
	        "January", "February", "March", "April", "May", "June","July", "August", "September","October", "November", "December", 
	        "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
	    };
	static String[] yearStr = {
	        "nineteen ninety one", "nineteen ninety two", "nineteen ninety three", "nineteen ninety four", 
	        "nineteen ninety five", "nineteen ninety six", "nineteen ninety seven", "nineteen ninety eight", "nineteen ninety nine",
	        "two thousand", "two thousand and one", "two thousand and two", "two thousand and three", "two thousand and four",
	        "two thousand and five", "two thousand and six", "two thousand and seven", "two thousand and eight", "two thousand and nine",
	        "two thousand and ten", "twenty eleven", "twenty twelse", "twenty thirteen", "twenty fourteen", "twenty fifteen",
	        "twenty sixteen", "twenty seventeen", "twenty eighteen", "twenty nineteen", "twenty twenty", "twenty twenty one", 
	    };

	
	
	
	
	public MyDate() {
        Calendar calen = Calendar.getInstance();
        this.day = calen.get(Calendar.DAY_OF_MONTH);
        this.month = calen.get(Calendar.MONTH);
        this.year = calen.get(Calendar.YEAR);
    }
	
	public MyDate(String date) {
        String part[] = date.split("/");
        this.day = Integer.parseInt(part[0]);
        this.month = Integer.parseInt(part[1]);;
        this.year = Integer.parseInt(part[2]);
        
    }
	
	public MyDate (String day, String month, String year){
        convertDay(day);
        convertMonth(month);
        convertYear(year);
    }
	
	private void convertDay(String day) {
        for(int i = 0; i < 31 ; i++) {
            if(day.equalsIgnoreCase(dayStr[i][0])) {
                this.day = Integer.parseInt(dayStr[i][1]);
            }
        }
    }

    private void convertMonth(String month) {
        for(int i=0; i< monthStr.length; i++) {
            if(month.equalsIgnoreCase(monthStr[i])) {
                this.month = i+1;
            }
        }
    }

    private void convertYear(String year) {
		for(int i = 0; i < 22; i++) {
			if(year.equalsIgnoreCase(yearStr[i]))
				this.year = i + 1991;
		}
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
	
	public int getDay() {
        return day;
    }

	public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
	
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
	
	public String validDate() {    
        if(this.year <= 0) {
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
        System.out.println("Enter date: ");
        String date = input.nextLine();
        MyDate test = new MyDate(date);
        System.out.println(test.getMonth() + " " + test.getDay() + " " + test.getYear());
        input.close();
    }
    
    public void printCurrentDate() {
    	MyDate date = new MyDate();
        String month = switch (date.getMonth()) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
        
        if(date.getDay() == 1 || date.getDay() == 21 || date.getDay() == 31)
            System.out.println("Today is: " + month + " " + date.day + "st " + date.year);
        else if(date.getDay() == 2 || date.getDay() == 22)
            System.out.println("Today is " + month + " " + date.day + "nd " + date.year);
        else if(date.getDay() == 3 || date.getDay() == 23)
            System.out.println("Today is: " + month + " " + date.day + "rd " + date.year);
        else
            System.out.println("Today is: " + month + " " + date.day + "th " + date.year);
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
    
    public void printFormat() {
        Calendar fDate = Calendar.getInstance();
        String dateFormat;
        int choose;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Select choose:  ");
        System.out.println("1. yyyy-MM-dd");
        System.out.println("2. d/M/yyyy");
        System.out.println("3. dd-MMM-yyyy");
        System.out.println("4. MMM d yyyy");
        System.out.println("5. mm-dd-yyyy");
        choose = input.nextInt();
        dateFormat = switch (choose) {
            case 1 -> "yyyy-MM-dd";
            case 2 -> "d/M/yyyy";
            case 3 -> "dd-MMM-yyyy";
            case 4 -> "MMM d yyyy";
            case 5 -> "MM-dd-yyyy";
            default -> "MMMM dd yyyy";
        };
        
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        System.out.println(formatter.format(fDate.getTime())); 
        input.close();
                                                                
    }

}