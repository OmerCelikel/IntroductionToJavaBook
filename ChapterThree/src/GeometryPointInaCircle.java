import java.util.Scanner;

public class GeometryPointInaCircle {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter a
		   point (x, y) and checks whether the point is within the circle centered at (0, 0) with
		   radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle,
		*/
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a point x coordinate: ");
		int xCord = input.nextInt();
		
		System.out.println("Enter a point y coordinate: ");
		int yCord = input.nextInt();
		
		System.out.println("Your Cordinate is (" + xCord + "," + yCord + ")");
		
		double cordinateLength = Math.sqrt(xCord * xCord + yCord *yCord);
		System.out.println("Your cordinate length is : " + cordinateLength);
		if(cordinateLength < 10)
			System.out.println("\nSo, Point (" + xCord + "," + yCord + ")" + " is in the 10 radius circle");
		else
			System.out.println("\nSo, Point (" + xCord + "," + yCord + ")" + " is NOT in the 10 radius circle");
	}

}
