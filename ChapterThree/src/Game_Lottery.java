import java.util.Scanner;

public class Game_Lottery {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int userNumber, systemNumber , a , b , c , d , e , f;
		
		System.out.println("Please Enter a Number To Win the Lottery");
		
		userNumber = input.nextInt();
		
		systemNumber =  (int) (Math.random() *1000);
		a  = userNumber / 100; 
		
		b = (userNumber % 100) / 10;
		
		c = userNumber % 10;
		
		d  = systemNumber / 100; 
		
		e = (systemNumber % 100) / 10;
		
		f = systemNumber % 10;
		
		System.out.println("Your Number Is: " +userNumber);

		System.out.println("System Number : " +systemNumber);

		
		if (userNumber == systemNumber)
			System.out.println("You won $12.000 dolllars");
		
		else if (  (a == d || a == e || a == f ) && (b == d || b == e || b == f ) && (c == d || c == e || c == f)  )
			System.out.println("You won $5.000 dolllars");
		
		else if ((a == d || a == e || a == f ) || (b == d || b == e || b == f ) || (c == d || c == e || c == f) )
			System.out.println("You won $2.000 dolllars");
		else
			System.out.println("You won nothing. Try again");
	}

}
