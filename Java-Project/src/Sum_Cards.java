import java.util.Scanner;

public class Sum_Cards {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] faces = input.nextLine().split(" ");
		
		int result = 0;
		int counter = 0;
		int prevValue = 0;

		for (int i = 0; i < faces.length; i++) {
			
			String letter = Character.toString(faces[i].charAt(0));
			
			if (letter.equals("1")) {
				letter += "0";
			}
			
			switch (letter) {
			case "A":
				letter = "15";
				break;
			case "K":
				letter = "14";
				break;
			case "Q":
				letter = "13";
				break;
			case "J":
				letter = "12";
				break;
			default:
				break;
			}
			int value = Integer.parseInt(letter);
			if (value == prevValue) {
				counter++;
			} else {
				counter = 1;
			}
			result = result + value;
			if (counter == 2) {
				result = result + 2 * value;
			}
			
			if (counter > 2) {
				result = result + value;
			}
			
			prevValue = value;		
		}
		System.out.println(result);
	}
}