package intro2java.chap5;

public class PE25 {
	public static String convertMillis(long millis) {
		long seconds = (millis % 60000) / 1000;
		long minutes = (millis % 3600000) / 60000;
		long hours = millis / 3600000;
		String timeCode = (hours + ":" + minutes + ":" + seconds);
		return timeCode;
	}
	public static void main(String[] args) {
		System.out.println(convertMillis(555550000));
	}
}
