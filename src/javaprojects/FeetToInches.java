package javaprojects;
import java.util.Scanner;

public class FeetToInches {
	
	public static int binaryToDecimal(int binary) {    //method to convert 4-bit binary to decimal
		int decimal=0, power = 0;
		
		while(binary!=0) {
			int digit = binary%10;    // get last digit (0 or 1)
			decimal = decimal + digit * (int) Math.pow(2,power);  // Math.pow() always returns a double, so need to cast to int
			binary = binary/10;       // remove last digit
			power++;                  // move to the next power of 2
		}
		return decimal;
	}
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a 4-bit binary number");
		int binary1 = keyboard.nextInt();
		
		System.out.println("Enter another 4-bit binary number");
		int binary2 =  keyboard.nextInt();
		
		// converting both inputs from binary (base-2) to decimal (base-10)
		int decimal1 = binaryToDecimal(binary1);
		int decimal2 = binaryToDecimal(binary2);
		
		int sum = decimal1+decimal2;   // sum of two decimals
		
		System.out.printf("The first number is %d %n", decimal1);
		System.out.printf("The second number is %d %n", decimal2);
		System.out.printf("Added together is %d%n", sum);
		
		keyboard.close();
	}
	
}
