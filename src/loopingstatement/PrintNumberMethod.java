package loopingstatement;

import java.util.Scanner;



public class PrintNumberMethod {
	void PrintingNum() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a start point:");
		int s = sc.nextInt();
		System.out.println("Enter a end point:");
		int e = sc.nextInt();

		while (s <= e) {

			if (s % 2 == 0) {

				System.out.println(s + "  ");

			}
			s++;

			System.out.println("Done");
			sc.close();

		}

	}
	 public static void main(String [] args) {
			
			
			//classname ref_var_name=new Classname();
			
			PrintNumberMethod obj=new PrintNumberMethod();
			
			
		//obj.method_name();
			
			 obj.PrintingNum();
		}

}

