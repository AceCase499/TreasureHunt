import java.util.Scanner;

public class SentenceReorder {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sent = keyboard.nextLine();
		
		String[] segs = sent.split(" ");
		
		
		System.out.print(segs[3].length());
		/*
		for (int i = 0; i < segs.length; i++) {
			System.out.print(i + segs[i] + " ");
		}
		*/
		
	}

}
