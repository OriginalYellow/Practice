/*
 * This is actually a pretty cool class, except there is no way of changing the
 * time zone. You could easily add that if you wanted to make this more useful.
 * All the constructors except the one that specifies hours/minutes/seconds use
 * the setTime method which takes a long, interprets it as an elapsed time in
 * milliseconds, and then finds the current time using the final conversion 
 * factors.
 */

package intro2java.chap10;

public class PE1Time {
	private static final Long YEARINMIL = 1000L * 60 * 60 * 24 * 365;
	private static final Long DAYINMIL = 1000L * 60 * 60 * 24;
	private static final Long HOURINMIL = 1000L * 60 * 60;
	private static final Long MINUTEINMIL = 1000L * 60;
	private static final int SECONDINMIL = 1000;
	private int hours; 
	private int minutes;
	private int seconds;

	public PE1Time() {
		setTime(System.currentTimeMillis());
	}
	
	public PE1Time(long ellapsed) {
		setTime(ellapsed);
	}
	
	public PE1Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void setTime(long ellapsed) {
		hours = (int) (ellapsed % DAYINMIL / HOURINMIL);
		minutes = (int) (ellapsed % DAYINMIL % HOURINMIL / MINUTEINMIL);
		seconds = (int) (ellapsed % DAYINMIL % HOURINMIL % MINUTEINMIL / SECONDINMIL);
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	//test platform
	public static void main(String[] args) {
		PE1Time t = new PE1Time(555550000);
		System.out.println(t.getHours());
		System.out.println(t.getSeconds());
		System.out.println(t.getMinutes());
	}

}
