package javaprojects;

public class HouseOfCats {
	public static void main(String args[]) {
		Cat cat1 = new Cat();
		
		System.out.println(cat1.getName() + " "+cat1.getWeight() + " "+cat1.getNumberOfLegs());
		
		cat1.setName("Mr. Flufferkins");
		cat1.setWeight(3);
		System.out.println(cat1.getName() + " "+cat1.getWeight() + " "+cat1.getNumberOfLegs());
		
		Cat cat2 = new Cat("Triscuit", 9.2, 4);
		System.out.println(cat2);
		
		Cat cat3 = new Cat("Mr. Flufferkins", 8.0, 4);
		System.out.println(cat1.equals(cat2));
		System.out.println(cat1.equals(cat3));
		System.out.println(cat1 == cat3);
		
		cat3 = cat2;
		cat2.setName("Dr.Boots");
		System.out.println(cat3.getName());
	}

}
