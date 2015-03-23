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
		
		//Computing Quadratic Formula
		double square = b * b - +4 * a * c;
		double positiveQuad = (-b + Math.sqrt(square)) / 2 * a;
		double negativeQuad = (-b - Math.sqrt(square)) / 2 * a;
		
	   System.out.println(positiveQuad + " " + negativeQuad);
	   in.close();
	}

}
