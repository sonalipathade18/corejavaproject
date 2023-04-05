package disicionstatement;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		int a = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Enter character  " + ch + "  is a vowel");

		} else if (ch >= 'a' && ch <= 'z')

			System.out.println("Enter character " + ch + "   is consonant");
		else

			System.out.println("please enter a alphabet");

	}

}
