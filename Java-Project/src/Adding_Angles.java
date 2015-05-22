import java.util.Scanner;

public class Adding_Angles {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] nums = new int [n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = input.nextInt();
		}
		
		boolean found = false;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int j2 = j + 1; j2 < nums.length; j2++) {
					int a = nums[i];
					int b = nums[j];
					int c = nums[j2];
					int sum = a + b + c;
					if ((sum == 360) || (sum == (360 * 2)) || (sum == (360 * 3)) || (sum == (360 * 4))
							|| (sum == (360 * 5)) || (sum == (360 * 6)) || (sum == (360 * 7))
								|| (sum == (360 * 8)) || (sum == (360 * 9)) || (sum == (360 * 10))
									|| (sum == (360 * 11)) || (sum == (360 * 12)) || (sum == (360 * 13))
										|| (sum == (360 * 14)) || (sum == (360 * 15)) || (sum == (360 * 16))
											|| (sum == (360 * 17)) || (sum == (360 * 18)) || (sum == (360 * 19))){
						System.out.printf("%d + %d + %d = %d degrees\n", a, b, c, a + b + c);
						found = true;
					}
				}
			}
		}
		
		if (!found) {
			System.out.println("No");
		}
	}
}