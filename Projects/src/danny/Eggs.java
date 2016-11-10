package danny;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	DecimalFormat df= new DecimalFormat("0.00");
		int eggs;
		int dozen=12;
		int dozensOfEggs;
		double price=0;
		int extra;
	
	System.out.println("Enter the number of eggs purchased : "); 
		eggs=scan.nextInt();
		dozensOfEggs= eggs/dozen;
	
		if (dozensOfEggs >11)
		price=0.35; 
		else if (dozensOfEggs <11)
		price=0.40;
		else if (dozensOfEggs <6)
		price=0.45; 
		else if (dozensOfEggs <4)
		price=0.50;
		extra=eggs%12;
	
	System.out.println("The bill is equal to:" +df.format (price*dozensOfEggs+price/12*extra));
		
		

	}

}
