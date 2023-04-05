package disicionstatement;

import java.util.Scanner;

public class StudentPassOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter A Marks");
		
		int m=sc.nextInt();
		
		
		if(m>=0 &&m<=100) 
			
			if(m>=40)
			
			System.out.println("Student is pass");
			
		else
	
			System.out.println("Student is fail");
		
		else {
			
			
			System.out.println("invalid marks");
			
		}

	}

}
