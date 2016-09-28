/**
 * 
 */
package danny;

import java.util.Scanner;

/**
 * ICS3C
 * 27/09/2016
 *ArithmaticExpressions
 *Danny Lang
 */
public class Age {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  Scanner
		 */
		Scanner scan=new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		System.out.println("Please Enter 5 numbers:");
		number1= scan.nextInt();
		number2= scan.nextInt();
		number3= scan.nextInt();
		number4= scan.nextInt();
		number5= scan.nextInt();
		System.out.println("Your total is: " +(number1 + number2 + number3 + number4 + number5));
		System.out.println("Second number - Third number is: "+(number2 - number3));
	    System.out.println("Your first number * Your 5 number is: "+(number1*number5));
	    System.out.println("Your fourth number / by your second number is:" +(number4/number2));
	    System.out.println("Your dividing number % by the second is: " +(number4%number2));
	}
		
}
