import java.util.Arrays;
import java.util.Scanner;


public class Bubble_Sort {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] numbers = input.nextLine().trim().split("[\\[\\]\\s,]+");
		numbers[0] = null;
		
		int[] array = new int[numbers.length - 1];
		for (int i = 0; i < numbers.length - 1; i++) {
			array[i] = Integer.parseInt(numbers[i + 1]);
		}
		
		int swap = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap = array[j];
					array[j] = array[j + 1];
					array[j + 1] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
