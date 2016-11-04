import java.util.Scanner;

/**
 * 
 */

/**
 *Danny Lang
 *GradeDisplay.java
 *October/31/2016
 *
 */
public class GradeDisplay {

	/**
	 * 
	 */
	public GradeDisplay() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
	int Grade;
		
		System.out.println("Enter Your Grade:");
		Grade=scan.nextInt();
		
		
		if (Grade>90)
			System.out.print("Good Job!");
			else
				System.out.print("Error");
		
		

	}

}
