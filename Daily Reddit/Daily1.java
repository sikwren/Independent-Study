//Reddit Daily Challenge #1(Easy): Name, age, and Reddit user name.

import java.util.Scanner;
public class Daily1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String name = in.nextLine();
		
		System.out.print("Please your age: ");
		int age = in.nextInt();
		
		System.out.print("Please enter your reddit user name: ");
		String username = in.next();
		
		System.out.println("Your name is " + name + " and you are " + age + " years old. Your Reddit username is " + username + ".");
		
		in.close();
	}

}
