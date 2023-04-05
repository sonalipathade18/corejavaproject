package basicofjava;

public class CharacterCaseConversion {

	public static void main(String[] args) {
		
		
		char ch='a';//a=97 A=65 small->capital==> -32
				
				int i=ch-32;  //i=97-32=65
				
				System.out.println((char)i);
				
				
				char c='H';
						   //capital->small==> +32
				int x=c+32;    //x=65+32=97
				
				System.out.println((char)x);
				
					
		

	}

}
