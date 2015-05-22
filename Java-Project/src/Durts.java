import java.util.Scanner;


public class Durts {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		
		int r = input.nextInt();
		int n = input.nextInt();
		
		int[] array = new int[n * 2];
		for (int i = 0; i < n * 2; i++) {
			array[i] = input.nextInt();
		}
		
		boolean inside = false;
		
		for (int i = 0; i < array.length; i+=2) {
			
			int a = array[i];
			int b = array[i + 1];
			
			boolean first = array[i] >= Cx - r + (r / 2) && array[i] <= Cx + r - (r / 2) 
								&& array[i + 1] >= Cy - r && array[i + 1] <= Cy + r;
			boolean second = array[i] >= Cx - r && array[i] <= Cx + r &&
								array[i + 1] >= Cy - r + (r / 2) && array[i + 1] <= Cy + r - (r / 2);
			if (first||second) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}