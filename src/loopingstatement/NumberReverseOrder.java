package loopingstatement;

import java.util.Scanner;

public class NumberReverseOrder {

	void addNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a start point:");
		int s = sc.nextInt();
		System.out.println("enter a end point:");
		int e = sc.nextInt();

		while (s >= e) {
			System.out.println(s + "  ");
			s--;

		}

		sc.close();

	}

	public static void main(String[] args) {

		NumberReverseOrder obj = new NumberReverseOrder();

		obj.addNum();

	}

}
