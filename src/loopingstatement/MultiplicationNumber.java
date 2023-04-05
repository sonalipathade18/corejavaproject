package loopingstatement;

import java.util.Scanner;

public class MultiplicationNumber {

	void multiNum() {
		// 1-6

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first point:");
		int x = sc.nextInt();
		System.out.println("enter a second point:");
		int y = sc.nextInt();
		int mul=1;
		while(x<=y) {
			
			mul=mul*x;
			x++;
			
		}
		System.out.println("multiplication is:" + mul);
		sc.close();

	}

	public static void main(String[] args) {

		// classname ref_var_name=new classname();

		MultiplicationNumber obj = new MultiplicationNumber();

		obj.multiNum();

	}

}
