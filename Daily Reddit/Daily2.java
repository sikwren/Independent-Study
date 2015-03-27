//Reddit Daily Challenge #2: 
//Write a specialized calculator for school: Quadratic Formula
import java.util.Scanner;

public class Daily2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Calculate the x's of a Quadratic Function:");
		System.out.println("Enter a,b,c: ");
		
		//User input for a, b, and c
		System.out.print("a = " );
		double a = in.nextDouble();
		System.out.print("b = ");
		double b = in.nextDouble();
		System.out.print("c = ");
		double c = in.nextDouble();
		
		double positiveQuad = 0;
		double negativeQuad = 0;
		
		double discriminant = b * b - 4 * a * c;
		
		if (discriminant > 0){
			positiveQuad = (-b + Math.sqrt(discriminant)) / (2 * a);
			negativeQuad = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Two real roots: " + positiveQuad + " and " + negativeQuad);
		}
		
		if (discriminant == 0){
			System.out.println("One real root: " + positiveQuad);
			
		}
		
		if (discriminant < 0){
			System.out.println("No real roots. Contains imaginary numbers.");
		}
		
	   
	   in.close();
	}

}
