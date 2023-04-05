package disicionstatement;

import java.util.Scanner;

public class StringState {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a state name:");
		String state = sc.nextLine();

		state = state.toLowerCase();

		switch (state) {

		case "maharashtra":
			System.out.println("mumbai");
			break;
		case "gujrat":
			System.out.println("ghandinagar");
			break;
		case "goa":
			System.out.println("panji");
			break;
		case "karnatak":
			System.out.println("banglore");
			break;
		case "madha pradesh":
			System.out.println("bopal");
			break;
		case "uttarkhand":
			System.out.println("delhi");
			break;
		case "jammu":
			System.out.println("shrinagar");
			break;
		case "panjab":
			System.out.println("chandigarh");
			break;
			default:System.out.println("please enter valid state");
			
				

		}

	}

}
