package javaprojects;

//Prajwal Khatiwada
public class MovieTester {
	public static void main(String[] args) {
// Create movies
		Movie m1 = new Movie(); // default constructor
		Movie m2 = new Movie("Inception", "Christopher Nolan", 148, 8.8, Movie.Genre.SCIFI);
		Movie m3 = Movie.createMovie("Titanic", "James Cameron", 195, 9.0, Movie.Genre.DRAMA);
// Display movies
		System.out.println("=== Movies Created ===");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
// Test watch methods
		m2.watch();
		m3.watch("Netflix");
// Test rating methods
		m1.rateMovie(4); // star rating
		m2.rateMovie(7.5); // numeric rating
		System.out.println("\nUpdated Ratings:");
		System.out.println(m1.getTitle() + ": " + m1.getRating());
		System.out.println(m2.getTitle() + ": " + m2.getRating());
// Test equals method
		Movie m4 = new Movie("Inception", "Christopher Nolan", 148, 8.8, Movie.Genre.SCIFI);
		System.out.println("\nIs m2 equal to m4? " + m2.equals(m4));
// Test discount
		m3.applyDiscount(20); // reduce rating by 20%
		System.out.println("\nAfter Discount, Titanic Rating: " + m3.getRating());
// Test isLongMovie
		System.out.println("Is Titanic a long movie? " + m3.isLongMovie());
// Show total movies created
		System.out.println("\nTotal movies created: " + Movie.getMovieCount());
	}
}