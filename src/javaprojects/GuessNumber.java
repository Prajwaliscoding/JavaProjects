package javaprojects;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have 3 chances to guess the number. Hint: It's from 1 to 10.");
		int secret = 3;
		int i = 0;
		while(i<3) {
			System.out.println("Guess the number:");
			int num;
			num = keyboard.nextInt();
			if(num == secret) {
				System.out.println("Correct guess. You win.");
				break;
			}
			else {
				i++;
			}
		}
		keyboard.close();

	}

}
