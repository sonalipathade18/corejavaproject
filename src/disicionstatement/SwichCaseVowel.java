package disicionstatement;

import java.util.Scanner;

public class SwichCaseVowel {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a vowel");

		ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println("ch+ is a vowel");
			break;

		case 'i':
			System.out.println("ch+ is i vowel");
			break;

		case 'o':
			System.out.println("ch+  is o vowel");
			break;

		case 'e':
			System.out.println("ch+ is e vowel");
			break;

		case 'u':
			System.out.println("ch+ is u vowel");

		default:
			System.out.println("not a alphabet");

		}

	}

}
