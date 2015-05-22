import java.util.Scanner;


public class Letters_Change_Numbers {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] numsLett = input.nextLine().split("\\s+");
		
		
		double sum = 0;
		for (int i = 0; i < numsLett.length; i++) {
			if (numsLett.length < 1) {
				break;
			}
			String curr = numsLett[i];
			char first = curr.charAt(0);
			char last = curr.charAt(curr.length() - 1);
			String num = curr.replaceAll("[^0-9]", "");
			double number = Double.parseDouble(num);
			int tempBig = 64;
			int tempSmall = 96;
			for (int j = 0; j < curr.length(); j++) {
				if (Character.isUpperCase(curr.charAt(0))) {
					double temp2 = (double) first;
					double alphabet = temp2 - tempBig;
					number = number / alphabet;
					sum += number;
					break;
				} else if(Character.isLowerCase(curr.charAt(0))) {
					double temp2 = (double) first;
					double alphabet = temp2 - tempSmall;
					number = number * alphabet;
					sum += number;
					break;
				}
			}
			for (int j = 0; j < curr.length(); j++) {
				if (Character.isUpperCase(curr.charAt(curr.length() - 1))) {
					double temp2 = (double) last;
					double alphabet = temp2 - tempBig;
					sum -= alphabet;
					break;
				} else if(Character.isLowerCase(curr.charAt(curr.length()- 1))) {
					double temp2 = (double) last;
					double alpabet = temp2 - tempSmall;
					sum += alpabet;
					break;
				}
			}
		}
      	System.out.printf("%.2f",sum);
		
	}
}