import java.util.Scanner;

public class Dozzen_Eggs {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int eggs = 0;
		int dozens = 0;
		
		for (int i = 0; i < 7; i++) {
			String[] current = input.nextLine().split(" ");
			
			String count = current[0];
			int num = Integer.parseInt(count);
			String measure = current[1];
			if (measure.equals("eggs") && (eggs + num > 12)) {
				int sum = eggs + num;
				for (int j = 0; j < num; j++) {
					if (sum - 12 > 0) {
						dozens++;
						sum = sum - 12;
						eggs = sum;
					}
				}
			} else if (measure.equals("dozens")) {
				dozens+=num;	
			}else {
				eggs+=num;
			}
			
		}
		
		if (eggs == 12) {
			dozens++;
			eggs = 0;
		}
		System.out.printf("%d dozens + %d eggs", dozens, eggs);
	}
}