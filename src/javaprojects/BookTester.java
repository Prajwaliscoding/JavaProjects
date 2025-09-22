package javaprojects;

public class BookTester {
	public static void main(String[] args) {
// Creating a default book
		System.out.println("Creating a default book...");
		Book defaultBook = new Book();
		System.out.println("Printing the default book's value:");
		System.out.println(defaultBook.toString());
// Creating another book with valid values
		System.out.println("\nCreating another book with valid values...");
		Book validBook = new Book("1984", "George Orwell", 328, 9.99);
		System.out.println("Printing the new book's value:");
		System.out.println(validBook.toString());
// Creating another default book
		System.out.println("\nCreating another default book...");
		Book invalidBook = new Book();
		invalidBook.setTitle("AB"); // Invalid since less than 3 characters
		invalidBook.setAuthor(""); // Invalid since empty
		invalidBook.setPages(20000); // Giving Invalid pages
		invalidBook.setPrice(-5.0); // Giving Invalid price
		System.out.println("Printing the newest book's value, which should revert to default:");
		System.out.println(invalidBook.toString());
// Checking if the first and last books have the same values
		System.out.println("\nChecking if the first and last books have the same values:");
		System.out.println(defaultBook.equals(invalidBook));
	}
}