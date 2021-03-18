package Inheritance;
import Animals.Animal;

// Dog is the subclass of Animal and Animal is the super class
public class Dog extends Animal {

	public Dog(String name, int numberOfLegs, boolean tail, boolean canFly) {
		super(name, numberOfLegs, tail, canFly);
	}

	@Override
	public String eat() {
		// you can call method from superclass
		// super.eat();

		return "It's eat dog food";
	}

	// new method
	public String canBark() {
		return "It's can bark";
	}
}