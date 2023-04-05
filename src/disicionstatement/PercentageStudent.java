package disicionstatement;

import java.util.Scanner;

public class PercentageStudent {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);

				double per;
		
		System.out.println("Enter student mark:");
		per=sc.nextDouble();
		if(per>=70 && per<=100)
			
			System.out.println("student distition:");
	
		else if(per>=60)
	        System.out.println("student  first class:");
		else if(per>=50)
		     System.out.println("student second class:");
		else if(per>=40)
		     System.out.println("student is pass:");
		else
			System.out.println("student is fail");
		
		
				
	}

}
