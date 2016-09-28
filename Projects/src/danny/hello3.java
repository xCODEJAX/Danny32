package danny;

import java.util.Scanner;
public class hello3 {

	public static void main(String[] args) 
	{
		Scanner check = new Scanner (System.in);
		System.out.print("Danny ");
		String firstName = check.nextLine();
		System.out.print("Lang ");
		String lastName = check.nextLine();
		System.out.println("Hello " + firstName + " " + lastName);
		System.out.println("Welcome to Java!");
	}

}
