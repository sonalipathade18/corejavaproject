package loopingstatement;

public class AdditionDigit {

	public static void main(String[] args) {
		
		
		int num=5432,add=0;// 5+4+3+2
		
		while(num!=0) {    // num=5432         num=543         num=54
			               //t                   t              t
		int r=num%10;	     //r=5432%10=2      r=543%10=3     r=54%10=4
			add=add+r;       //add=0+2=2        add=2+3=5        add=5+4=9
			num=num/10;      //num=5432/10=543    num=543/10=54   num=54/10=5
			
		}
		
		System.out.println("addition is:"+add);	

	}

}
