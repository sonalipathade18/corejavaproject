package disicionstatement;

import java.util.Scanner;

public class PrintZtoA {
	
	
	void xyzNum(){
		
		char z,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a start point:");
		z = sc.next().charAt(0);
		System.out.println("enter a end point:");
		a= sc.next().charAt(0);

		while (z >= a) {

			System.out.print(z + " ");
			z--;
		}
		sc.close();
	}
	

	public static void main(String[] args) {
		
		PrintZtoA obj=new PrintZtoA();
		
		obj.xyzNum();

	}

}
