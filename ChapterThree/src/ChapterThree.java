import java.util.Scanner;

public class ChapterThree {
	public static void main(String[] args) {
		/*
		// 3.1 AdditionQuiz
		Scanner input = new Scanner(System.in);

		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);

		System.out.println("What is " + number1 + " + " + number2 + " ?");

		int answer = input.nextInt();

		System.out.println(number1 + " + " + number2 + " = " + answer + " Is...." + 
				(number1 + number2 == answer));

		//---------------------------------------------------------------


		System.out.println("Current Time Millis =  " + (System.currentTimeMillis() % 10));

		int a = (int) (Math.random() * 10);
		int b = (int)(Math.random() * 100);

		System.out.println("Math Random a =  " + a);
		System.out.println("Math Random b =  " + b);



		//3.7 Generating Random Numbers (3.3)

		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		System.out.println("number 1 = " + num1);
		System.out.println("number 2 = " + num2);
		if(num1 < num2) {
			//swapping num1 and num2
			int a = 0;

			a = num1 ;
			num1 = num2;
			num2=a;
		}

		System.out.println("What is num1 - num2");
		int answer = input.nextInt();
		int result = num1 - num2;
		System.out.println("result "  + result);
		if(answer == result)
			System.out.println("correct");
		else
			System.out.println("wrong");

		System.out.println( (answer == result) ? "correct" : "wrong"); //if answer == result print correct else print wrong

		 


		//Programming Exercises

		//3.4 RANDOM MONTH

		

		System.out.println("Enter a month : ");

		int year = input.nextInt();

		switch (year) {
		case 0: System.out.println("January");
		break;
		case 1: System.out.println("February");
		break;
		case 2: System.out.println("March");
		break;
		case 3: System.out.println("April");
		break;
		case 4: System.out.println("May");
		break;
		case 5: System.out.println("June");
		break;
		case 6: System.out.println("July");
		break;
		case 7: System.out.println("August");
		break;
		case 8: System.out.println("September");
		break;
		case 9: System.out.println("October");
		break;
		case 10: System.out.println("November");
		break;
		case 11: System.out.println("December");
		break;
		default: System.out.println("There is no such month");
		}


		
		//3.9 BUSINESS: CHECK ISBN-10
		
		int d1 = (int)(Math.random() * 10);
		int d2 = (int)(Math.random() * 10);
		int d3 = (int)(Math.random() * 10);
		int d4 = (int)(Math.random() * 10);
		int d5 = (int)(Math.random() * 10);
		int d6 = (int)(Math.random() * 10);
		int d7 = (int)(Math.random() * 10);
		int d8 = (int)(Math.random() * 10);
		int d9 = (int)(Math.random() * 10);
		
		System.out.println( d1 + " " + d2+ " " + d3+ " "
		+ d4 + " "+ d5+ " " + d6+ " "
				+ d7 + " "+ d8+ " " + d9+ " ");
		
		int d10 = d1 + d2 + d3 + d4 + d5 + d6 +  d7 + d8 + d9;
		
		System.out.println("d10 = " + d10);

		switch (d10 % 11) {
		case 0:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 1:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 2:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 3:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 4:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 5:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 6:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 7:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 8:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 9:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + (d10 % 11));
			break;
		case 10:
			System.out.println(d1 + "" + d2+ "" + d3+ ""
					+ d4 + ""+ d5+ "" + d6+ ""
					+ d7 + ""+ d8+ "" + d9+ "" + "X");
			break;
		
		}
*/
		
		//3.12	(Palindrome integer) Enter Three digit palindrome
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pelase Enter 3 digits");
		int numberUser = input.nextInt();
		
		int houndred = numberUser / 100;
		
		int tens = (numberUser % 100) / 10;
		
		int ones = numberUser % 10;
		
		System.out.println(houndred + " " + tens + "  " +  ones);
		
		if ( houndred == ones)
			System.out.println(numberUser + " is a palindrome");
		else
			System.out.println(numberUser + " is not a palindrome");
		
		
		
		
		
		
		
		
		
		
		

	}
}
