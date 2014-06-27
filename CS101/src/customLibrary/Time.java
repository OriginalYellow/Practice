package customLibrary;

public class Time {
	
	public static String Millis2HMS(long totalMillis) {
		long seconds = (totalMillis % 60000) / 1000;
		long minutes = (totalMillis % 3600000) / 60000;
		long hours = totalMillis / 3600000;
		String timeCode = (hours + ":" + minutes + ":" + seconds);
		return timeCode;
	}
	
	public static String Millis2HMSM(long totalMillis) {
		long millis = (totalMillis % 1000);
		long seconds = (totalMillis % 60000) / 1000;
		long minutes = (totalMillis % 3600000) / 60000;
		long hours = totalMillis / 3600000;
		String timeCode = (hours + ":" + minutes + ":" + seconds + ":" + millis);
		return timeCode;
	}
	
}
