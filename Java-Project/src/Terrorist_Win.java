import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Terrorist_Win {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		
		String patternStr = "\\|(.*?)\\|";
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		StringBuilder newStr = new StringBuilder(inputStr);
		char[] buff = inputStr.toCharArray();
		int lastIndex = 0;
		
		while (matcher.find()) {
			String bomb = matcher.group(1);
			int firstIndex = newStr.indexOf(bomb);
			int secIndex = (firstIndex + bomb.length() - 1);
			char[] array = bomb.toCharArray();
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				int value = array[i];
				sum += value;
				lastIndex = sum % 10;
			}
			
			if (firstIndex < lastIndex) {
				firstIndex = lastIndex + 1;
			}
			
			for (int i = firstIndex - lastIndex - 1; i <= secIndex + 1 + lastIndex; i++) {
				if (i >= buff.length) {
					break;
				}
				buff[i] = '.';
			}
		}
		System.out.println(new String(buff));
	}
}