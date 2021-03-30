package Date;

public class DateUtils {
	public static int compare(MyDate date1, MyDate date2) {
		if(date1.getYear() > date2.getYear()) {
			return 1;
		} 
		else if (date1.getYear() < date2.getYear()) {
			return -1;
		} 
		else {
			if (date1.getMonth() > date2.getMonth()) {
				return 1;
			} 
			else if (date1.getMonth() < date2.getMonth()) {
				return -1;
			} 
			else {
				if (date1.getDay() > date2.getDay()) {
					return 1;
				} 
				else if (date1.getDay() < date2.getDay()) {
					return -1;
				} 
				else return 0;
			}
		}
	}
	public static void swap(MyDate date1, MyDate date2) {
        int day2 = date2.getDay();
        int month2 = date2.getMonth();
        int year2 = date2.getYear();
        date1.setDay(day2);
        date1.setMonth(month2);
        date1.setYear(year2);


    }

	public static void sortDate(MyDate... date) {
		for (int i = 0; i < date.length; i++) {
			for (int j = i; j < date.length; j++) {
				if(compare(date[i], date[j]) > 0){
					swap(date[i], date[j]);
				}
			}
		}
	}

	public static void printListDate(MyDate[] dlist) {
		for (int i=0; i<dlist.length; i++) {
			dlist[i].print();
		}
	}
}