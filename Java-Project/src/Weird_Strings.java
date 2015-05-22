import java.util.Scanner;


public class Weird_Strings {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextLine = input.nextLine();
		nextLine = nextLine.replaceAll("[\\s()|\\\\]+", "");
		String [] words = nextLine.split("\\P{Alpha}+");
		
		long biggestSum = 0;
		String bigWords = "";

		for (int i = 0; i < words.length - 1; i++) {
			String current = words[i].toLowerCase() + words[i + 1].toLowerCase();
			long sum = 0;
			char[] array = current.toCharArray();
			for (int k = 0; k < array.length; k++) {
				sum += array[k] - ('a' - 1);
			}
			
			if (sum> biggestSum) {
				biggestSum = sum;
				bigWords = words[i] + "\n" + words[i+1];
			}
		}
		System.out.println(bigWords);

	}
}