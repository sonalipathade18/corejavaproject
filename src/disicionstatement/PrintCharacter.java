package disicionstatement;

import java.util.Scanner;

public class PrintCharacter {

	void abcNum() {
		char a, z;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a start point:");
		a = sc.next().charAt(0);
		System.out.println("enter a end point:");
		z = sc.next().charAt(0);

		while (a <= z) {

			System.out.print(a + " ");
			a++;
		}
		sc.close();
	}

	public static void main(String[] args) {

		PrintCharacter obj = new PrintCharacter();

		obj.abcNum();

	}

}
