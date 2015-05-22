import java.util.Scanner;
import java.util.Arrays;
public class Possible_Triangles {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean validMatch = false;
		while(true){
			
			String duration = input.nextLine();
			if (duration.equals("End")) {
				break;
			}
			String[]numbers = duration.split(" ");
			
			
			double[] number = new double[numbers.length];
			
			for (int i = 0; i < number.length; i++) {

				number[i] = Double.parseDouble(numbers[i]);
			}
			
			Arrays.sort(number);		

			
			for (int i = 0; i < number.length; i++) {
				for (int j = i + 1; j < number.length; j++) {
					for (int k = j + 1; k < number.length; k++) {
						double a = number[i];
						double b = number[j];
						double c = number[k];
						boolean formula = a + b > c;
						if (formula == true) {
							System.out.printf("%.2f+%.2f>%.2f\n",a, b,c);
							validMatch = true;
						}
					}
				}
			}
		}
		
		if (!validMatch) {
			System.out.println("No");
		}
	}
}