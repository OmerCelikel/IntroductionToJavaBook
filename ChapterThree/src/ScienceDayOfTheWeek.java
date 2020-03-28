import java.util.Scanner;

public class ScienceDayOfTheWeek {

	public static void main(String[] args) {
		// there is given formula
		Scanner input = new Scanner(System.in);
		
		//user side
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
			
		System.out.println("Enter month: 1-12: ");
		int month = input.nextInt();
		
		System.out.println("Enter the day of the month: 1-31: ");
		int dayOfMonth = input.nextInt();
		
		
		int day;
		//Zeller’s congruence
		day = (dayOfMonth + (26 * (month + 2) / 10 ) + (year % 100) + (year % 100) / 4 + 
				(year / 100) / 4 + (5 * (year / 100)) ) % 7;
		
		System.out.println("Day is : " + day);
		//contiune wtih switch case
	}

}
