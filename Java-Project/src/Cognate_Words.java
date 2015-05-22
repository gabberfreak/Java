import java.util.Scanner;


public class Cognate_Words {
	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextLine = input.nextLine();
		String [] words = nextLine.split("\\P{Alpha}+");
		String sequence = "";
		
		boolean found = false;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				for (int k = 0; k < words.length; k++) {
					if (i + 1 > words.length || j + 1 > words.length || k + 1 > words.length || words.length == 2) {
						break;
					} else {
						String a = "" + words[i] + "|" + words[j] + "=" + words[k];
						
						if (a.equals(sequence)) {
							continue;
						}
						if ((words[i] + "" + words[j]).equals(words[k])) {
							sequence = "" + words[i] + "|" + words[j] + "=" + words[k];
							System.out.printf("%s|%s=%s\n", words[i],words[j],words[k]);
							found = true;
						}
					}
				}	
			}
		}
		
		if (!found) {
			System.out.println("No");
		}
	}
}