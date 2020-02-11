import java.util.Scanner;

public class ChapterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//2.1
		double radius, area;
		radius = 20;
		area = radius * radius * 3.14;
		System.out.println("Area is " + area);

		//2.2.1
		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;
		System.out.println("j is " + j + " and"
				+ " 8 k is " + k);





		//2.2
		Scanner input = new Scanner(System.in);
		System.out.println("/n Enter a number for radius");
		double radius1 = input.nextDouble();
		double area1 = radius1 * radius1 * 3.1415;
		System.out.println("The area for the circle of radius "
				+ radius1 + " is " + area);

		//2.3 ComputeAverage
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers = ");
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();

		double average = (number1 + number2 + number3) / 3;
		System.out.println("Average is : " + average);





		//2.12 Displaying The Current Time
		System.currentTimeMillis();

		System.out.println(System.currentTimeMillis());

		int totalseconds , totalminutes , totalhours;

		totalseconds = (int) (System.currentTimeMillis() / 1000);

		totalminutes = (totalseconds / 60)  ;

		totalhours = (totalminutes / 60) ; 

		System.out.println(totalhours + " : " + totalseconds + " : "+ 
				totalminutes);

		int realseconds , realminutes , realhours;

		realhours = totalhours % 24;
		realminutes = totalminutes % 60;
		realseconds = totalseconds % 60;

		System.out.println(realhours + " : " + realminutes + " : "+ 
				realseconds	);



		/*
		 * LAST QUESTIONS
		 * 
		 */

		//2.1 Convert mile to km

		System.out.println("Please enter miles: ");
		int miles = input.nextInt();

		double km = miles * 1.6;

		System.out.println(miles + " miles is " + km + "km");




		//2.2 Compute the volume of	triangle
		double area2, volume;
		System.out.println("Please enter side");
		double lenght = input.nextDouble();

		area2 =  (Math.sqrt(3) / 4) * (Math.pow(lenght, 2)) ;
		volume = area2 * lenght;

		System.out.println("Area is: "+ area2 + " Volume is : "
				+ volume);




		//2.3 Convert Meters into feet
		System.out.println("Enter a value for meter : ");
		int meter = input.nextInt();
		double feet = meter * 3.2178;
		System.out.println(meter + " meters is " + feet + " feet");



		//2.4 Convert square meter into ping

		System.out.println("Enter a number in square meters : ");
		int squremeter = input.nextInt();
		double ping = squremeter * 0.3025;
		System.out.println(squremeter + " squremeter is " + ping + " ping");





		//2.5 Financial Application: Calculate Tips
		System.out.println("Enter the subtotal and a gratutiy rate : ");
		double subtotal = input.nextInt();
		double gratuityRate = input.nextInt();
		double gratuity = subtotal * gratuityRate/100;
		double total1 = subtotal + (gratuity);
		System.out.println("The gratuity is " + gratuity + " and total is $" +
				total1);



		//2.6 Multiply the digits in an integer

		System.out.println("Enter a number between 0 and 1000: ");
		int number12 = input.nextInt();
		int hundreds = number12 / 100;
		int unitDigit = number12 % 10;
		int tensDigit = (number12 % 100) /10;
		int allDigits = hundreds * unitDigit * tensDigit;
		System.out.println(hundreds);
		System.out.println(unitDigit);
		System.out.println(tensDigit);
		System.out.println("The multiplication of all digits in 999 is :" + allDigits);




		// 2.7 (Find the number of years)
		System.out.println("Enter the number of minutes: ");
		int minutes1 = input.nextInt();
		int years1 = (minutes1 / (60*24*365));
		int days1 = (minutes1 % (365)) % (60*24) ;
		System.out.println(years1 + " " + days1);
		System.out.println(minutes1 + " minutes is approximately " + years1 +
				" years and " + days1 + " days");




		//2.8

		// Prompt user to enter the time offset of GMT
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();

		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;
		currentHour = currentHour + offset;

		// Display results
		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond);




		// 2.9 (Physics: acceleration) 
		System.out.println("Enter v0, v1, and t: ");
		double v0  = input.nextDouble();
		double v1  = input.nextDouble();
		double t  = input.nextDouble();
		double acceleration = (v1 - v0) / t;
		System.out.println("The average acceleration is " + acceleration);



		//2.10 (Science: calculating energy)

		System.out.println("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();

		System.out.println("Enter the initial temperature: ");
		double temperature = input.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double energy = kilograms * (finalTemperature - temperature) * 4184;

		System.out.println("The energy needed is  " + energy);




		//2.13  (Financial application: compound value) 

		System.out.println("Enter the monthly saving amount: ");
		int monthlyMoney = input.nextInt();

		double monthlyInterestRate = (1 + 0.003125);
		double first = monthlyMoney * monthlyInterestRate;

		double second = (monthlyMoney + first) * monthlyInterestRate;

		double third = (monthlyMoney + second) * monthlyInterestRate;
		double four = (monthlyMoney + third) * monthlyInterestRate;
		double five = (monthlyMoney + four) * monthlyInterestRate;
		double sixth = (monthlyMoney + five) * monthlyInterestRate;

		System.out.println("After the first month, the account value is " + first);
		System.out.println("After the 2 month, the account value is " + second);

		System.out.println("After the 3 month, the account value is " + third);

		System.out.println("After the 6 month, the account value is " + sixth);



		//2.14 (Health application: computing BMI)

		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();

		double bmi = (weight * 0.4535)  / Math.pow((height * 0.0254), 2);

		System.out.println("BMI is " + bmi);



		// 2.23 (Cost of driving)

		System.out.println("Enter the driving distance:  ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double miles1 = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double price1 = input.nextDouble();

		double coast = (distance / miles1) * price1;

		System.out.println("The cost of driving is "  + coast);



































	}

}
