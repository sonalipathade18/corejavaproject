package disicionstatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a vowel");
		ch = sc.next().charAt(0);

		switch (ch) {

		case 'a':

		case 'i':

		case 'o':

		case 'u':

		case 'e':
			System.out.println("enter vowel");
			break;

		default:
			System.out.println("please enter valid vowel");

		}

	}

}
