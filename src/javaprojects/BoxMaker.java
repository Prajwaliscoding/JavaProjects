
package javaprojects;

import java.util.Scanner;

public class BoxMaker {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(
				"I can draw a box using stars (*).\nGive me a length followed by a width, where both are greater than 0");
		int length = keyboard.nextInt();
		int width = keyboard.nextInt();
		if (length <= 0 || width <= 0) {
			System.out.println("That is invalid!");
			System.exit(0);
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
