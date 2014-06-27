package intro2java.chap5;

import javax.swing.JOptionPane;

class DateProcessor {
	public DateProcessor(long totalNumberOfDays) {
		days = totalNumberOfDays;
	}
	public int currentYear = 1970;
	public long days;
	public boolean incomplete = true;
	public void process() {
		if (PrintCalendar.isLeapYear(currentYear)) {
			days -= 366;
		}
		else
			days -= 365;
		currentYear++;
		if (PrintCalendar.isLeapYear(currentYear)) {
			if (days < 366) incomplete = false;
		}
		else {
			if (days < 365) incomplete = false;
		}
	}
}

public class PE24 {
	public static void printCurrentTimeAndDate() {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		long totalNumberOfDays = totalHours / 24;
		DateProcessor d = new DateProcessor(totalNumberOfDays);
		while (d.incomplete) {
			d.process();
		}
		int month = 1;
		while (d.days >= 0) { 
			d.days -= PrintCalendar.getNumberOfDaysInMonth(d.currentYear, month);
			month++;
		}
		//the month is offset by 1
		month -= 1;
		String currentMonth = PrintCalendar.getMonthName(month);
		//the day is offset by 1, this may not be a permanent fix, check again at the end of month
		int currentDay = 1 + (PrintCalendar.getNumberOfDaysInMonth(d.currentYear, month) + (int)d.days);
		String currentDateAndTime = ("The date is " + currentMonth + " " + currentDay + ", " + d.currentYear +
				"\nThe time is " + 	CurrentTime.getCurrentTime());
	    JOptionPane.showMessageDialog(null, currentDateAndTime);
	}
	public static void main(String[] args) {
		printCurrentTimeAndDate();
	}
}
