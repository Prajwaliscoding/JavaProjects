package javaprojects;
import java.util.Scanner;

public class SentinelAverageDemo {
	private static final int SENTINEL = -1; 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter positive integers to average.");
		System.out.println("Enter a negative number (e.g., -1) to finish.");
		System.out.println("----------------------------------------------");
		int count = 0; 
		long sum = 0; 
		
		while (true) { 
			System.out.print("Value #" + (count + 1) + ": ");
			if (!in.hasNextInt()) {
				String bad = in.next(); 
				System.out.println(" Not an integer: \"" + bad + "\". Try again.");
				continue; 
			}
			int value = in.nextInt(); 
			if (value == SENTINEL || value < 0) { 
				break; 
			}
			sum += value; 
			count++; 
		}
		if (count > 0) {
			double average = (double) sum / count; 
			System.out.println("Average of " + count + " numbers = " + average);
		} else {
			System.out.println("No valid numbers were entered.");
		}
		in.close(); 
	}
}
