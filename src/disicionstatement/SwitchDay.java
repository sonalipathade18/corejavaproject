package disicionstatement;

import java.util.Scanner;

public class SwitchDay {

	public static void main(String[] args) {
		
		int day;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		day=sc.nextInt();
		
		switch(day) {
		case 1:
		System.out.println("1.monday");
		break;
		case 2:
		System.out.println("2.tuesday");
		break;
		case 3:
		System.out.println("3.wednesd");
		break;
		case 4:
			
		System.out.println("4.thursday");
		break;
		case 5:
		System.out.println("5.friday");
		break;
		case 6:
		System.out.println("6.saturday");
		case 7:
		System.out.println("7.sunday");
		break;
		default:System.out.println("invalid input");
		
		
		
		}	

	}

}
