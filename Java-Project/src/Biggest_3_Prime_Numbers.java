import java.util.Scanner;

public class Biggest_3_Prime_Numbers {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		String[] array = inputStr.trim().split("[\\s()]+");
		array[0] = array[1];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = null;
		
		int[] nums = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			nums[i] = Integer.parseInt(array[i]);
		}
		
		int count = 0;
		int result = 0;
		boolean isPrime = true;
		
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] <= 1) {
				continue;
			} else if (nums[i] > 1) {
				isPrime = true;
				for (int j = 2; j < nums[i]; j++) {
					if (nums[i] % j == 0) {
						isPrime = false;
					}
				}
				
				if (isPrime) {
					count++;
					result += nums[i];

					if (count == 3) {
						break;
					}
				}
			} 
		}
		
		if (count < 3) {
			System.out.println("No");
		} else {
			System.out.println(result);
		}
	}
}