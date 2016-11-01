import java.util.Scanner;

/**
 * 
 */

/**
 *Danny Lang
 *Divisible.java
 *October/31/2016
 *
 */
public class Divisible {

	/**
	 * 
	 */
	public Divisible() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int integers;
		
		System.out.println("Enter integers:");
		integers=scan.nextInt();
		
		
		if (integers % 7 != 0)
			System.out.print("This integer is divisible by 7");
			else
				System.out.print("This integer is not divisible by 7");
	}

}
