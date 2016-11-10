package danny;

import java.util.Scanner;

public class nameasker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double percent;
		String name;
		System.out.println("Enter a persons name: ");
		name= scan.nextLine();
		percent=(Math.random()*100)+1;
		if(percent>=0.7){
		System.out.println(" This is your favourite name!");
		}
		else 
		System.out.println("This is not your faourite name");
		}

	}


