import java.util.*;

public class PolygonArea {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double sCount = keyboard.nextDouble();
		double sLength = keyboard.nextDouble();
		
		double Aest = (Math.pow((sCount * sLength), 2)) / 4 * Math.PI;
		
		double cot = 1.0 / Math.tan((Math.PI / sCount));
		double A = (1/4) * sCount * (Math.pow(sLength, 2)) * cot;
		double Truth = Aest - A;
		
		System.out.printf("%.3f", Truth);
	}
}
