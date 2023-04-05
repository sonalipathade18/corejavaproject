package disicionstatement;

import java.util.Scanner;

public class AccountHolder {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Age");
		
		int age=sc.nextInt();
		
		if(age>=18)
			
			System.out.println("open bank account");
		
		else
			
			System.out.println("not open bank account");
		
		
		
		

	}

}
