/**
 * 
 */
package danny;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 323842039
 *
 */
public class Printing {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		int number;
		
		System.out.println("Enter the number of copies to be printed:");
		number=scan.nextInt();
		
		if (number<=99){
			System.out.println("Price per copy is: 0.30");
			System.out.println("Your total is:$" + df.format (0.30*number));		
		}
		else if (number<=199){
			System.out.println("Price per copy is: 0.28");
			System.out.println("Your total is:$" + df.format (0.30*number));
		}
			
			else if (number<=749){
				System.out.println("Price per copy is: 0.27");
				System.out.println("Your total is:$" + df.format(0.30*number));
				
			}
			else if (number<=1000){
				System.out.println("Price per copy is: 0.26");
				System.out.println("Your total is:$" + df.format(0.30*number));
			}
			else if (number>=1000){
				System.out.println("Price per copy is: 0.25");
				System.out.println("Your total is:$" + df.format(0.25*number));
	
			}
			
		}

		
	}


