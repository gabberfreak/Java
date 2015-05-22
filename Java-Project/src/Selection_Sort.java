import java.util.Arrays;
import java.util.Scanner;


public class Selection_Sort {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		String[] nums = inputStr.split("[\\[\\]\\s,]+");
		nums[0] = null;
		
		int[] arr = new int[nums.length - 1];
		for (int i = 0; i < nums.length - 1; i++) {
			arr[i] = Integer.parseInt(nums[i + 1]);
		}
		
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			int smaller = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j]  < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}