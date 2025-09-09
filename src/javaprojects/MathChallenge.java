package javaprojects;
import java.util.Scanner;
import java.util.Random;

public class MathChallenge {
	
	public static final int RANGE = 5;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Are you ready for math challenge?");
		System.out.println("yes or no");
		String play = keyboard.nextLine();
		
		Random r = new Random();// Creates a new Random object named r for generating random numbers.
		
		int num1 = r.nextInt(RANGE);
		int num2 = r.nextInt(RANGE);
		
		int result = num1 + num2;
		
		if (play.equalsIgnoreCase ("yes")) {
			System.out.printf("What is the sum of %d and %d? ",num1, num2 );
			int input = keyboard.nextInt();
			
			if(input == result) {
				System.out.println("You Win");
			}
			else {
				System.out.println("You lose");
			}
		}
		else {
			System.out.println("AW...");
			System.exit(0);
		}
		keyboard.close();
	}

}
