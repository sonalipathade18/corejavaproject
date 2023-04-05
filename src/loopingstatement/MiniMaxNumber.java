package loopingstatement;

public class MiniMaxNumber {

	public static void main(String[] args) {
		int min = 2, max = 5, num = 15432;

		// min=2,max=5
		while (num != 0) { // num=15432            num=1543                     num=154     num=15       num=1    num=0

			int r = num % 10; // r=15432%10=2        r=1543%10=3                r=154%10=4  r=15%10=5   r=1%10=1
			if (r > max) {    // f                        t                          t       t           f

				max = r;                             //  max=3                    max=4       max=5   

			}
			if (r < min)       // f                       f                           f       f            t

			{

				min = r;                                                                                 //    min=1

			}
			num = num / 10; // num=15432/10=1543     //num=1543/10=154           num=154/10=15 num=15/10=1     num=1%10=0

		}

		System.out.println("max digit:" + max);
		System.out.println("min digit:" + min);

	}

}
