
public class ChapterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//COMMENT LINE
		
		/*
		 * COMMENT LINE
		 */		
		
		// 1.1
		System.out.println("Welcome to Java");
		
		//1.2
		System.out.println("Programming is fun");
		System.out.println("Fundementals First");
		System.out.println("Problem Driven");
		
		//1.3
		System.out.print("(10.5 + 2 * 3) / (45-3.5) = ");
		System.out.println( (10.5 + 2 * 3) / (45-3.5) );
		
		//1.6
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32);
		
		System.out.println((9 / 5));
		
		//	PROGRAMMING EXERCISES
		 
		//1.1	DISPLAY SOME MESSAGES
		System.out.println("Welcome to Java, Learning Java now, "
				+ "Programming is fun");
		
		//1.2 Display a message 5 times
		System.out.println("I love JAVA");
		System.out.println("I love JAVA");
		System.out.println("I love JAVA");
		System.out.println("I love JAVA");
		System.out.println("I love JAVA");
		
		//1.3 Display that
		
		System.out.println("    J            ");
		System.out.println("J  aaa    v    vaaa");
		System.out.println("J  J  aa    v v   a a");
		System.out.println("J   aaaa     v    aaaa");
		
		//1.4 Print table
		System.out.println("a		a^2		a^3		a^4");
		System.out.println("1		1		1		1");
		System.out.println("2		4		8		16");
		System.out.println("3		9		27		81");
		System.out.println("4		16		64		256");
		
		//1.5 compute expressions
		System.out.print("(7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5) = ");
		System.out.println( (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5) );
		
		
		//1.6 Summation of a series n(n+1)/2
		
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = ");
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 );
		
		//1.7 Approximate PI
		// computer says 1/3 = 0
		System.out.println(" PI = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)");
		System.out.println(4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11));
		
		//1.8 Area and perimeter of a circle
		
		System.out.println("Perimeter = " + 2 * 6.5 * 3.14159);
		System.out.println("Area = " + 6.5 * 6.5 * 3.14159);
		
		//1.9 Area and perimeter of a rectangle
		
		System.out.println("Area = " + 5.3 * 8.6);
		System.out.println("Perimeter = " + 2 * (5.3 + 8.6));
		
		//1.10 Average speed in miles
		//average speed = total distance / time
		
		//km to mile   15 km how many mile? 9.32 miles
		
		System.out.println("Average speed is = " + (15 / 1.6) / (50/ 60));
		//15 / 1.6) / (50/ 60) ------->  (50/ 60) smaller than 1 so our programs see it is 0
		
		
		
		// 1.11	Population 
		//births = 365*24*60*60 / 7 +
		//deaths = 365*24*60*60 /13 -
		//immigrant = 365*24*60*60 / 45 +
		//Current population is 312 032 486
		
		System.out.println("2021 Population = " + (312032486 + 
				(365*24*60*60 / 7) - 365*24*60*60 /13 + 365*24*60*60 / 45));
		System.out.println("2022 Population = " + (314812582 + 
				(365*24*60*60 / 7) - 365*24*60*60 /13 + 365*24*60*60 / 45));
		System.out.println("2023 Population = " + (317592678 + 
				(365*24*60*60 / 7) - 365*24*60*60 /13 + 365*24*60*60 / 45));
		System.out.println("2024 Population = " + (320372774 + 
				(365*24*60*60 / 7) - 365*24*60*60 /13 + 365*24*60*60 / 45));
		System.out.println("2025 Population = " + (323152870 + 
				(365*24*60*60 / 7) - 365*24*60*60 /13 + 365*24*60*60 / 45));
		
		//or		
		System.out.println("Every year = " + (
				(365*24*60*60 / 7) - 365*24*60*60 /13 + 365*24*60*60 / 45));
		System.out.println("2021 Population = " + (312032486 + 2780096));
		
		
		
		
	}

}
