/**
 * 
 */
package danny;

import java.util.Scanner;

/**
 * ICS3C
 * 15/09/2016
 * Danny Lang	
 *FastFoodResturant
 */
public class FastFoodRestaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		double burgers;
		double fries;
		double sodas;
		double tax;
			
		burgers=1.69;
		fries=1.09;
		sodas=0.99;
		tax=0.90;
		
		System.out.println("Enter the number of burgers:");
		burgers=scan.nextDouble();
		System.out.println("Enter the number of fries:");
		fries=scan.nextDouble();
		System.out.println("Enter the number of Sodas:");
		sodas=scan.nextDouble();
		
		
		System.out.println("Total before tax:" +(burgers+1.60+fries+1.09+sodas+0.99));
		System.out.println("Tax:"+(tax));

		System.out.println("Final Total:"+(burgers+1.60+fries+1.09+sodas+0.99+tax+0.90));
		
		

		
		
		
		
		
		

	

	}

}
