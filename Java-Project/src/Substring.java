import java.util.Scanner;

public class Substring {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());

        boolean hasMatch = false;

        for (int startIndex = 0; startIndex < text.length(); startIndex++) {
        	
            if ('p' == text.charAt(startIndex)) {
                hasMatch = true;

                int endIndex = jump;
                
                if (endIndex < startIndex) {
                    endIndex = startIndex + jump;
                    if (endIndex == text.length()) {
						endIndex--;
					}
                }

                String matchedString = text.substring(startIndex, endIndex + 1);
                System.out.println(matchedString);
                startIndex += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
			
	}
}