package javaprojects;

//Prajwal Khatiwada
public class Movie {
// Instance variables
	private String title;
	private String director;
	private int duration; // in minutes
	private double rating; // 0.0 - 10.0
	private Genre genre;

// Enum for movie genres
	public enum Genre {
		ACTION, COMEDY, DRAMA, HORROR, SCIFI, UNKNOWN
	}

// Static variable to track total number of movies
	private static int movieCount = 0;

// Default constructor
	public Movie() {
		this("Unknown", "Anonymous", 90, 0.0, Genre.UNKNOWN);
	}

// Parameterized constructor
	public Movie(String title, String director, int duration, double rating, Genre genre) {
		setTitle(title);
		setDirector(director);
		setDuration(duration);
		setRating(rating);
		setGenre(genre);
		movieCount++;
	}

// Static methods
	public static int getMovieCount() {
		return movieCount;
	}

	public static Movie createMovie(String title, String director, int duration, double rating, Genre genre) {
		return new Movie(title, director, duration, rating, genre);
	}

// Convert minutes into "Xh Ym" format
	public static String convertDuration(int minutes) {
		int hours = minutes / 60;
		int mins = minutes % 60;
		return hours + "h " + mins + "m";
	}

// Getters
	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getDuration() {
		return duration;
	}

	public double getRating() {
		return rating;
	}

	public Genre getGenre() {
		return genre;
	}

// Setters with validation
	public void setTitle(String title) {
		if (title != null && title.length() >= 3) {
			this.title = title;
		} else {
			this.title = "Unknown";
		}
	}

	public void setDirector(String director) {
		if (director != null) {
			this.director = director;
		} else {
			this.director = "Anonymous";
		}
	}

	public void setDuration(int duration) {
		if (duration >= 30 && duration <= 300) {
			this.duration = duration;
		} else {
			this.duration = 90;
		}
	}

	public void setRating(double rating) {
		if (rating >= 0.0 && rating <= 10.0) {
			this.rating = rating;
		} else {
			this.rating = 0.0;
		}
	}

	public void setGenre(Genre genre) {
		if (genre != null) {
			this.genre = genre;
		} else {
			this.genre = Genre.UNKNOWN;
		}
	}

// Overloaded methods
	public void watch() {
		System.out.println("Watching " + title + "...");
	}

	public void watch(String platform) {
		System.out.println("Watching " + title + " on " + platform + "...");
	}

	public void rateMovie(double rating) {
		setRating(rating);
	}

	public void rateMovie(int stars) {
		if (stars >= 1 && stars <= 5) {
			setRating(stars * 2.0); // convert stars (1–5) to 10-point scale
		} else {
			setRating(0.0);
		}
	}

// String representation of the movie
	public String toString() {
		return "Title: " + title + "\nDirector: " + director + "\nDuration: " + convertDuration(duration) + "\nRating: "
				+ rating + "\nGenre: " + genre;
	}

// Compare two Movie objects
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movie))
			return false;
		Movie other = (Movie) obj;
		return this.title.equals(other.title) && this.director.equals(other.director) && this.duration == other.duration
				&& this.rating == other.rating && this.genre == other.genre;
	}

// Apply discount to rating
	public void applyDiscount(double percentage) {
		double discount = rating * (percentage / 100);
		rating -= discount;
		if (rating < 0.0)
			rating = 0.0;
	}

// Check if movie is long
	public boolean isLongMovie() {
		return duration > 150;
	}
}