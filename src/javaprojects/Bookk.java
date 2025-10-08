package javaprojects;

public class Bookk{
	private String title;
	private double price;
	private static int totalBooks = 0;
	
	public Bookk() {
		this("Unknown", 10.0);
	}
	
	public Bookk(String title, double price) {
		setTitle(title);
		setPrice(price);
		totalBooks++;
	}
	
	public void setTitle(String title) {
		this.title = (title.length() >=3 ) ? title : "Unknown";
	}
	public void setPrice(double price) {
		this.price = (price >= 0.0)? price : 0.0;
	}
	public String getTitle() {
		return this.title;
	}
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Bookk)) return false;
		Bookk other = (Bookk) o;
		return title.equalsIgnoreCase(other.title);
	}
	@Override
	public int hashCode() {
		return title.toLowerCase().hashCode();
	}
	
	public static int getTotalBooks() {
		return totalBooks;
	}
}

