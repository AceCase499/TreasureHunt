import java.util.Scanner;

public class ContestQ2 {
	public static void main(String[] args) {
		
        Scanner keyboard = new Scanner(System.in);
		double radius = keyboard.nextDouble();
		
		double volume = Math.pow(radius, 3) * (4.0/3.0) * Math.PI;
		System.out.printf("%.3f", volume);        
	}

}
