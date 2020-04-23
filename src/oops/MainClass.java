package oops;


class Cat {
	boolean hasFur;
	String color,breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("The Cat is walking");
	}
	
	public void eat() {
		System.out.println("The cat is eating");
	}
	
	public void description() {
		System.out.println
		("My cat has "+ legs +" legs and "+eyes+" eyes");
	}
	
}

class Dog {
	
	String breed, name;
	public void jump() {
		System.out.println("My dog name "+name+" jumped");
	}
	
	public void description() {
		System.out.println
		("my dog is "+name+" and breed is "+breed);
	}
	
	
}

public class MainClass {

	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		cat2.legs = 4;
//		cat2.eyes = 1;
//		
//		cat1.description();
//		cat2.description();
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "husky";
	    husky.name = "Browny";
	    
	    poodle.breed = "poodle";
	    poodle.name = "moolchand";

		poodle.jump();
		husky.description();
		
		
		
	}

}
