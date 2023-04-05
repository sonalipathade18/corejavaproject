package loopingstatement;

import java.util.Scanner;

public class AdditionEvenOROdd {
	
	void evenOrOdd() {
		
		int x,y,even=0,odd=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start number");
		 x =sc.nextInt();
		System .out.println("Enter a end  number:");
		 y=sc.nextInt();
		while(x<=y) {
			if(x%2==0) {
				
				even=even+x;
			}else {
				
				odd=odd+x;
			}
			x++;
		}
		System.out.println("Addition of even number:"+even);
		System.out.println("Addition of odd number:"+odd);
	}


	public static void main(String[] args) {
		
		AdditionEvenOROdd obj=new AdditionEvenOROdd();
	
           obj.evenOrOdd();
	}

}
