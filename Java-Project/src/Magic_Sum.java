import java.util.ArrayList;
import java.util.Scanner;


public class Magic_Sum {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int D = input.nextInt();
		input.nextLine();
		ArrayList<Integer> array = new ArrayList<>(); 
		while (true) {
			String current = input.nextLine();
			if (current.equals("End")) {
				break;
			}
			array.add(Integer.parseInt(current));
		}
		boolean found = false;
		long biggestSum = -10000;
		int biggest1 = 0;
		int biggest2 = 0;
		int biggest3 = 0;
		
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				for (int k = j + 1; k < array.size(); k++) {
					int a = array.get(i);
					int b = array.get(j);
					int c = array.get(k);
					long sum = a + b + c;
					if ((sum % D == 0) && (sum > biggestSum)) {
						found = true;
						biggestSum = a + b + c;
						biggest1 = a;
						biggest2 = b;
						biggest3 = c;
					}
				}
			}
		}
		
		if (!found) {
			System.out.println("No");
		} else {
			System.out.printf("(%d + %d + %d) %% %d = 0",biggest1,biggest2,biggest3,D);
		}
	}
}