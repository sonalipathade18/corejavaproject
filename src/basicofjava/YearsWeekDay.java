package basicofjava;

public class YearsWeekDay {

	public static void main(String[] args) {
		
		
		int D=1,W=7,Y=365;
		
		
		 Y=(D/365);
		 W=(D%365)/7;
		 D=D-((Y*365)+(W));
		 
		 System.out.println("Enter the days:\n");
		 
		 System.out.println("\n"+Y+"Year,"+W+"Week,and"+D+"Day\n");
		 
		
		
		

	}

}
