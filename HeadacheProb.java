import java.util.Scanner;

public class HeadacheProb {
	public static void main(String[] args) {
		
        Scanner keyboard = new Scanner(System.in);
		double seltzers = keyboard.nextDouble();
		double exams = keyboard.nextDouble();
		
		double inner = 1.0 - (1.0/(Math.pow(2.0, exams)));
		double outer = inner + 1.0;
		
		double headache = (1.0/seltzers) * outer;
		
		if (headache > 1.0) {
			headache = 1;
		}
		if (headache < 0) {
			headache = 0;
		}
		//System.out.println(headache);
		System.out.printf("%.3f", headache);        
	}

}
