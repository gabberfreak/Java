import java.util.Scanner;


public class Gandalf_Stash {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mood = input.nextInt();
		input.nextLine();
		String[] foods = input.nextLine().split("[\\W_]+");
		int count = mood;
		for (int i = 0; i < foods.length; i++) {
			String current = foods[i].toLowerCase();
			if (current.equals("cram")) {
				count+=2;
			} else if(current.equals("lembas")) {
				count+=3;
			} else if(current.equals("apple")) {
				count+=1;
			} else if(current.equals("melon")) {
				count+=1;
			} else if(current.equals("honeycake")) {
				count+=5;
			} else if(current.equals("mushrooms")) {
				count+=-10;
			} else {
				count--;
			}
		}
		

		if (count < -5) {
			String moods = "Angry";
			System.out.printf("%d\n%s", count, moods);
		} else if (count >= -5 && count < 0) {
			String moods = "Sad";
			System.out.printf("%d\n%s", count, moods);
		} else if (count >= 0 && count < 15) {
			String moods = "Happy";
			System.out.printf("%d\n%s", count, moods);
		} else if(count >= 15) {
			String moods = "Special JavaScript mood";
			System.out.printf("%d\n%s", count, moods);
		}
	}
}