package javaprojects;
import java.util.Scanner;

public class DateAndTimeTester {

	// Method to handle user input and call validation methods
	public void run() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter date and time (MM/DD hh:mm)");
		String date_time = keyboard.nextLine();

		if (isValid(date_time)) {
			System.out.println("The date and time are valid.");
		} else {
			System.out.println("The date and time are invalid.");
		}
		keyboard.close();
	}

	// Checks if the full string has valid date and time structure
	public boolean isValid(String date_time) {
		if (date_time == null || !date_time.contains("/") || !date_time.contains(" ") || !date_time.contains(":")) {
			return false;
		}

		String[] parts = date_time.split(" ");
		if (parts.length != 2) {
			return false;
		}

		String date = parts[0];
		String time = parts[1];

		return isValidDate(date) && isValidTime(time); // Using and operation. If both true then only returns true
	}

	// Validating "MM/DD"
	public boolean isValidDate(String date) {
		if (!date.contains("/")) {
			return false;
		}
		int month = getMonth(date);
		int day = getDay(date);

		if (month < 1 || month > 12) {
			return false;
		}
		int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		return day >= 1 && day <= daysInMonth[month - 1];
	}

	// Validating "hh:mm"
	public boolean isValidTime(String time) {
		if (!time.contains(":")) {
			return false;
		}

		int hour = getHour(time);
		int minute = getMinute(time);

		return (hour >= 1 && hour <= 12) && (minute >= 0 && minute < 60);
	}

	// Extracting month
	public int getMonth(String date) {
		String[] parts = date.split("/");
		return Integer.parseInt(parts[0]); // Converting string to integer
	}

	// Extracting day
	public int getDay(String date) {
		String[] parts = date.split("/");
		return Integer.parseInt(parts[1]); // Converting string to integer
	}

	// Extracting hour
	public int getHour(String time) {
		String[] parts = time.split(":");
		return Integer.parseInt(parts[0]);
	}

	// Extracting minute
	public int getMinute(String time) {
		String[] parts = time.split(":");
		return Integer.parseInt(parts[1]);
	}

}
