import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Timespan {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		String start = input.nextLine();
		String end = input.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date d1 = format.parse(start);
		Date d2 = format.parse(end);
			
		long diff = d2.getTime() - d1.getTime();
			
		long diffSeconds = diff /1000 % 60;
		long diffMinutes = diff /60 /1000 % 60;
		long diffHours = diff / 3600 / 1000;
		
		String seconds = Long.toString(diffSeconds);
		String minutes = Long.toString(diffMinutes);
		String hours = Long.toString(diffHours);
		
		String minuteStr = minutes.replaceFirst("^-+(?!$)", "");
		long minutesFixed = Long.parseLong(minuteStr);
		
		String secondsStr = seconds.replaceFirst("^-+(?!$)", "");
		long secondsFixed = Long.parseLong(secondsStr);
		
		String hoursStr = hours.replaceFirst("^-+(?!$)", "");
		long hoursFixed = Long.parseLong(hoursStr);
		
		System.out.printf("%d:%02d:%02d\n", hoursFixed,minutesFixed,secondsFixed);
	}
}