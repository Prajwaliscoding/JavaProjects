package javaprojects;
public class BookMain{
	public static void main(String[] args) {
		Bookk b1 = new Bookk("Java",10.0);
		Bookk b2 = new Bookk("JAVA",20.0);
		
		System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
}