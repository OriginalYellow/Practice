package intro2java.chap8;

import java.util.*;

public class PE5 {
	
	public static void main(String[] args) {
	
		GregorianCalendar g = new GregorianCalendar();
		System.out.println("Today is " + g.get(GregorianCalendar.MONTH) + 
				"/" + g.get(GregorianCalendar.DAY_OF_MONTH) + 
				"/" + g.get(GregorianCalendar.YEAR));
		g.setTimeInMillis(1234567898765L);
		System.out.println("Today is " + g.get(GregorianCalendar.MONTH) + 
				"/" + g.get(GregorianCalendar.DAY_OF_MONTH) + 
				"/" + g.get(GregorianCalendar.YEAR));
	
	}
}
