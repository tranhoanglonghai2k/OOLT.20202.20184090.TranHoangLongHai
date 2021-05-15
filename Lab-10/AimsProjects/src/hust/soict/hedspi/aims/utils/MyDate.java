package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean valid;

    public MyDate() {
        LocalDate date = LocalDate.now();

        valid = setMonth(date.getMonthValue()) && setYear(date.getYear()) && setDay(date.getDayOfMonth());

        assert valid : "Cannot Print";
    }

    public MyDate(int _day, int _month, int _year)
    {
        boolean valid1 = setMonth(_month);
        boolean valid2 = setYear(_year);
        boolean valid3 = setDay(_day);
        valid = valid1 && valid2 && valid3;

        assert valid : "Cannot Print";
    }

    public MyDate(String day, String month, String year)
    {
        boolean valid1 = setMonth(Month.Translate(month));
        boolean valid2 = setYear(Year.Translate(year));
        boolean valid3 = setDay(Day.Translate(day));
        valid = valid1 && valid2 && valid3;
    }

    //Format dd/mm/yyyy
    public MyDate(String _date)
    {
        String[] date = _date.split("/", 3);

        boolean valid1 = setMonth(Integer.parseInt(date[1]));
        boolean valid2 = setYear(Integer.parseInt(date[2]));
        boolean valid3 = setDay(Integer.parseInt(date[0]));
        valid = valid1 && valid2 && valid3;

        assert valid : "Cannot Print";
    }

    public static void swap(MyDate d1, MyDate d2)
    {
        int tmp = d1.getDay();
        d1.setDay(d2.getDay());
        d2.setDay(tmp);

        tmp = d1.getMonth();
        d1.setMonth(d2.getMonth());
        d2.setMonth(tmp);

        tmp = d1.getYear();
        d1.setYear(d2.getYear());
        d2.setYear(tmp);
    }

    public void accept()
    {
        try (Scanner sn = new Scanner(System.in)) {
			System.out.print("Enter a date (dd/mm/yyyy): ");
			String date = sn.nextLine();

			String[] splitDate = date.split("/", 3);

			boolean valid1 = setMonth(Integer.parseInt(splitDate[1]));
			boolean valid2 = setYear(Integer.parseInt(splitDate[2]));
			boolean valid3 = setDay(Integer.parseInt(splitDate[0]));
			valid = valid1 && valid2 && valid3;
		}
        assert valid : "Cannot Print";
    }

    private boolean IsLeapYear(int year)
    {
        if(year % 100 == 0)
        {
            return year % 400 == 0;
        }else{
            return year % 4 == 0;
        }
    }

    public boolean setDay(int day) {
        this.day = day;
        switch (getMonth()) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (day > 0 && day <= 31)
                {
                    return true;
                }
            }
            case 4, 6, 9, 11 -> {
                if (day > 0 && day <= 30)
                {
                    return true;
                }
            }
            case 2 -> {
                if (IsLeapYear(year)) {
                    if (day > 0 && day <= 29)
                        return true;
                } else {
                    if (day > 0 && day <= 28)
                        return true;
                }
            }
        }

        System.out.println("Wrong Day Format ");
        return false;
    }

    public boolean setMonth(int month) {
        this.month = month;
        if(month > 0 && month < 13)
            return true;
        System.out.println("Wrong Month Format ");
        return false;
    }

    public boolean setYear(int year) {
        this.year = year;
        if(year > 0 && String.valueOf(year).length() == 4)
            return true;
        System.out.println("Wrong Year Format ");
        return false;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void Print(String format)
    {
        if(valid)
        {
            switch(format)
            {
                case "yyyy-MM-dd":
                {
                    String _day = String.valueOf(getDay());
                    if(_day.length() == 1)
                    {
                        _day = "0" + _day;
                    }
                    String _month = String.valueOf(getMonth());
                    if(_month.length() == 1)
                    {
                        _month = "0" + _month;
                    }

                    System.out.println(getYear() + "-" + _month + "-" + _day);
                    break;
                }

                case "d/MM/yyyy":
                {
                    System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
                    break;
                }

                case "dd-MMM-yyyy":
                {
                    String _day = String.valueOf(getDay());
                    if(_day.length() == 1)
                    {
                        _day = "0" + _day;
                    }
                    String _month = Month.GetInLetter(getMonth());
                    _month = _month.substring(0, 3);

                    System.out.println(_day + "-" + _month + "-" + getYear());
                    break;
                }

                case "MMM d yyyy":
                {
                    String _month = Month.GetInLetter(getMonth());
                    _month = _month.substring(0, 3);

                    System.out.println(_month + " " + getDay() + " " + getYear());
                    break;
                }

                case "MM-dd-yyyy":
                {
                    String _day = String.valueOf(getDay());
                    if(_day.length() == 1)
                    {
                        _day = "0" + _day;
                    }
                    String _month = String.valueOf(getMonth());
                    if(_month.length() == 1)
                    {
                        _month = "0" + _month;
                    }

                    System.out.println(_month + "-" + _day + "-" + getYear());
                    break;
                }
            }
        }else{
            System.out.println("=> The date " + getDay() + "/" + getMonth() + "/" + getYear() + " is not in correct format");
        }
    }
}