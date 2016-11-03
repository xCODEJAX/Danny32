/**
 * 
 */
package danny;

import java.util.Scanner;

/**
 * @author 323842039
 *
 */
public class Testscore {

	/**
	 * 
	 */
	public Testscore() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int testscore;
		char grade = 'F';
		
		System.out.println("Enter The Percentage: ");
		testscore=scan.nextInt();
		
		if (testscore >= 90)
			grade = 'A';
		else if (testscore >=70)
			grade = 'B';
		else if (testscore >=70)
			grade = 'C';
		else if (testscore >=60)
			grade = 'D';
		else if (testscore >=60)
			grade = 'F';
		
		System.out.println("The corresponding grade is:"+grade);

	}

}
