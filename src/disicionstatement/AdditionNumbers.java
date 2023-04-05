package disicionstatement;

import java.util.Scanner;

public class AdditionNumbers {

	void addNum() {
		// 1-6

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a start point:");
		int s = sc.nextInt();
		System.out.println("enter a end point:");
		int e = sc.nextInt();
		int add = 0;
		while (s <= e) {

			add = add + s;
			s++;
		}
		System.out.println("Addition is:" + add);
		sc.close();

	}

	public static void main(String[] args) {

		// classname ref_var_name=new classname();

		AdditionNumbers obj = new AdditionNumbers();

		obj.addNum();

	}

}
