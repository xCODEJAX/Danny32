package danny;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		int eggs;
		
		System.out.println("Enter the amount of eggs:");
		eggs=scan.nextInt();
		
		if (eggs<=99){
			System.out.println("Enter the number of eggs purchased: 0.50");
			System.out.println("The bill is equal to:$" + df.format (0.50*eggs));
		}
		
		

	}

}
