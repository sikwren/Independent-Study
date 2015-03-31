//Even Fibonacci numbers
//Considering the terms in the Fibonacci sequence whose values
//do not exceed four million, find the sum of the even-valued terms.
public class Problem2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int a = 1;
		int b = 2;
		int f = a + b;
		
		while (f < 4000000){
			if (f % 2 == 00){
				sum = sum + f;
			}
			a = b;
			b = f;
			f = a + b;
		}
		System.out.println(sum);
	}
}
