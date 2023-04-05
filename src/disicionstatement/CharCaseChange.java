package disicionstatement;

import java.util.Scanner;

public class CharCaseChange {

	public static void main(String[] args) {
		char ch;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Alphabet");

		ch = sc.next().charAt(0);// cha=S

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("print alphabet");

		}

		else {
			System.out.println("not a alphabet");

		}

	}

}
