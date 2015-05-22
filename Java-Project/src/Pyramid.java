import java.util.Arrays;
import java.util.Scanner;


public class Pyramid {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		input.nextLine();
		String current = input.nextLine().trim();
		int currInt = Integer.parseInt(current);
		String output = "" + current;
		
		for (int i = 0; i < rows - 1; i++) {
			String nextLine = input.nextLine();
			String[] arrayStr = nextLine.trim().split("\\s+");
			int[] arrayInt = new int [arrayStr.length];
			for (int j = 0; j < arrayStr.length; j++) {
				arrayInt[j] += Integer.parseInt(arrayStr[j]);
			}
			
			Arrays.sort(arrayInt);
			boolean found = false;
			
			for (int j = 0; j < arrayInt.length; j++) {
				if (currInt < arrayInt[j]) {
					currInt = arrayInt[j];
					output += ", " + currInt;
					found = true;
					break;
				}
			}
			if (!found) {
				currInt++;
			}
		}
		System.out.println(output);
	}
}