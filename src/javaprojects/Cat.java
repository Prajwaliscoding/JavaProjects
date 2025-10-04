package javaprojects;

public class Cat {
	private String name;
	private double weight;
	private int numberOfLegs;
	
	// Constructor 1
	public Cat() {
		this.name = "none";
		this.weight = 1.0;
		this.numberOfLegs = 4;
	}
	
	// Constructor 2 for validation. Set garda sidai j paye tei set nahos vanera yesari suruma setter lai call garxau 
	// ani setters ma kura haru validate hunxan. 
	// jastai number of legs ma kosaile 6 rakhdiyo vane tellai 6 nai set ta garna milena kinaki a cat has only 4 legs.
	//  so tyo case ma 4 nai rakhidine athawa vanum hamro default nai rakhidine.
	public Cat(String N, double W, int L) {
		this.setName(N);
		this.setWeight(W);
		this.setNumberOfLegs(L);
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}
	
	// Setters
	// yei validate garna hamile mathi direclty set nagareko. constructor 2 banako
	public void setName(String N) {
		if(N!=null) {
			this.name = N;
		}
		else {
			this.name = "none";
		}
	}
	
	public void setWeight(double W) {
		if(W<=0) {
			this.weight = 1.0;
		}
		else {
			this.weight = W;
		}
	}
	
	public void setNumberOfLegs(int L) {
		if(L>4 && L<=0) {
			this.numberOfLegs = 4;
		}
		else {
			this.numberOfLegs = L;
		}
	}
	
	// it literally converts the object into a String representation
	// this is automatically called when main class bata object print garinxa
	public String toString() {
		return this.name+" "+this.weight+" "+this.numberOfLegs;
	}
	
	// equals for string and == for int.
	public boolean equals(Cat cat) {
		return cat!= null && this.name.equals(cat.getName()) && this.weight==cat.getWeight() && this.numberOfLegs==cat.getNumberOfLegs();
	}
	
	
}
