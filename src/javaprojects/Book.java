package javaprojects;

//Prajwal Khatiwada
public class Book {
//instance variables
	private String title;
	private String author;
	private int pages;
	private double price;

//default constructor
	public Book() {
		this.title = "Unknown";
		this.author = "Anonymous";
		this.pages = 100;
		this.price = 0.0;
	}

//parametrized constructor
	public Book(String title, String author, int pages, double price) {
		setTitle(title);
		setAuthor(author);
		setPages(pages);
		setPrice(price);
	}

//There are accessors
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}

	public double getPrice() {
		return price;
	}

//these are mutators
	public void setTitle(String title) {
		if (title.length() >= 3) {
			this.title = title;
		} else {
			this.title = "Unknown";
		}
	}

	public void setAuthor(String author) {
//checking for null as well as empty or string that has just whitespace
		if (author != null && !author.trim().isEmpty()) {
			this.author = author;
		} else {
			this.author = "Anonymous";
		}
	}

	public void setPages(int pages) {
		if (pages >= 1 && pages <= 10000) {
			this.pages = pages;
		} else {
			this.pages = 100;
		}
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0.0;
		}
	}

//since there is already a function with same name, we are overriding
	@Override
	public String toString() {
		return "Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages + ", Price: "
				+ this.price;
	}

	public boolean equals(Book book) {
		return ((this.title.equalsIgnoreCase(book.title)) && (this.author.equalsIgnoreCase(book.author))
				&& (this.pages == book.pages) && (this.price == book.price));
	}

	public void discountByPercentage(double percentage) {
		this.price = this.price - percentage * this.price;
	}

	public boolean isThick(Book book) {
		return (book.pages >= 300);
	}
}
