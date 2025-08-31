package javaprojects;

import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner is closed properly
        try (Scanner input = new Scanner(System.in)) {
            // Output instructions
            System.out.println("What is your zodiac? Enter your birthday –");
            System.out.println("- Month followed by Day as numbers");

            // Read month and day
            int month = input.nextInt();
            int day   = input.nextInt();

            // --- Validate month ---
            if (month < 1 || month > 12) {
                System.out.println("Invalid Month!");
                return;
            }

            // --- Validate day ---
            if (month == 2) { // February
                if (day < 1 || day > 29) {
                    System.out.println("Invalid Day!");
                    return;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) { 
                if (day < 1 || day > 30) {
                    System.out.println("Invalid Day!");
                    return;
                }
            } else { // 31-day months
                if (day < 1 || day > 31) {
                    System.out.println("Invalid Day!");
                    return;
                }
            }

            // --- Determine Zodiac sign ---
            String zodiac = "";

            switch (month) {
                case 1:
                    zodiac = (day <= 19) ? "Capricorn" : "Aquarius";
                    break;
                case 2:
                    zodiac = (day <= 18) ? "Aquarius" : "Pisces";
                    break;
                case 3:
                    zodiac = (day <= 20) ? "Pisces" : "Aries";
                    break;
                case 4:
                    zodiac = (day <= 19) ? "Aries" : "Taurus";
                    break;
                case 5:
                    zodiac = (day <= 20) ? "Taurus" : "Gemini";
                    break;
                case 6:
                    zodiac = (day <= 20) ? "Gemini" : "Cancer";
                    break;
                case 7:
                    zodiac = (day <= 22) ? "Cancer" : "Leo";
                    break;
                case 8:
                    zodiac = (day <= 22) ? "Leo" : "Virgo";
                    break;
                case 9:
                    zodiac = (day <= 22) ? "Virgo" : "Libra";
                    break;
                case 10:
                    zodiac = (day <= 22) ? "Libra" : "Scorpio";
                    break;
                case 11:
                    zodiac = (day <= 21) ? "Scorpio" : "Sagittarius";
                    break;
                case 12:
                    zodiac = (day <= 21) ? "Sagittarius" : "Capricorn";
                    break;
            }

            // Output result
            System.out.println("Your Zodiac sign is: " + zodiac);
        }
    }
}
