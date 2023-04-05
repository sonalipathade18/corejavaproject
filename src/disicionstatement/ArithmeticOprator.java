package disicionstatement;

import java.util.Scanner;

public class ArithmeticOprator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.addition");
		System.out.println("2.multiplication");
		System.out.println("3.division");
		System.out.println("4.substraction");
		System.out.println("5.square of number");
		System.out.println("Enter your choice");
		int option = sc.nextInt();

		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		switch (option) {

		case 1:
			System.out.println("addition is: " + (a + b));
			break;
		case 2:
			System.out.println("multiplication:" + (a * b));
			break;

		case 3:
			System.out.println("division is:" + (a / b));
			break;
		case 4:
			System.out.println("substraction:" + (a - b));
			break;

		case 5:
			System.out.println("square of number A is :" + (a * a) + " And square of number B is :" + (b * b));
			break;
		default:
			System.out.println("please enter a valid option.....");

		}

	}

}
