import java.util.Scanner;

public class Game_Scissor_Rock_Paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int computerIs;
		computerIs = (int) (Math.random() * 3) ; //It generates 0,1,2
			//0 --> scissor
			//1 --> rock
			//2 --> paper 
		//System.out.println(computerIs);
		
		System.out.println("Scissor? Rock? Paper?");
		System.out.println("0 means scissor");
		System.out.println("1 means rock");
		System.out.println("2 means paper");
		
		int userIs;
		userIs = input.nextInt();		
		System.out.println("You choose --> " + userIs);
		System.out.println("Computer ýs --> " + computerIs);
		if( (computerIs == 0 && userIs == 2) || ( computerIs == 1 && userIs == 0)
				|| (computerIs == 2 && userIs == 1) )
			System.out.println("You LOST");
		
		else if( (computerIs == 0 && userIs == 1) || (computerIs == 1 && userIs == 2)
				|| (computerIs == 2 && userIs == 0) )
			System.out.println("You WON");
		else 
			System.out.println("It is a draw");
		
		/*
		if ( computerIs == 0 && userIs == "scissor")	
			System.out.println("0It is a draw");
		else if ( computerIs == 0 && userIs == "rock")
			System.out.println("0You WON");
		else if(computerIs == 0 && userIs == "paper")
			System.out.println("0You LOST");
		
		
		if ( computerIs == 1 && userIs == "scissor")	
			System.out.println("1You LOST");
		else if ( computerIs == 1 && userIs == "rock")
			System.out.println("1It is a draw");
		else if( computerIs == 1 && userIs == "paper")
			System.out.println("1You WON");
		
		
		if ( computerIs == 2 && userIs == "scissor")	
			System.out.println("2You WON ");
		else if ( computerIs == 2 && userIs == "rock")
			System.out.println("2You LOST");
		else 
			System.out.println("2It is a draw");
		*/
		
	}

}
