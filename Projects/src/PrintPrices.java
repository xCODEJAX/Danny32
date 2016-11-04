import java.util.Scanner;
/**
 *Danny Lang
 *GradeDisplay.java
 *October/31/2016
 *
 */
public class PrintPrices {

	
	public PrintPrices() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	int copies;
	double price=0.00;
		
		System.out.println("Enter Your copies:");
		copies=scan.nextInt();
		
			
		if (copies>0-99)
			price=0.30;
		else if (copies>499)
			price=0.27;
		
		else if (copies>1000){
			price=0.26;
		}
		
		else if (copies>1000){
			price=0.25;
		}
		
			System.out.print("Price per copie");
			
		
		

	}

}
