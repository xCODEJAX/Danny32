package danny;

import java.util.Scanner;
public class hello3 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("Danny ");
		String firstName = scan.nextLine();
		System.out.print("Lang ");
		String lastName = scan.nextLine();
		System.out.println("Hello " + firstName + " " + lastName);
		System.out.println("Welcome to Java!");
	}

}
