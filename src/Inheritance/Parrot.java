package Inheritance;
import Animals.Animal;

public class Parrot extends Animal {

	public Parrot(String name, int numberOfLegs, boolean tail, boolean canFly) {
		super(name, numberOfLegs, tail, canFly);
	}

	public String canTalk() {
		return "Hey, I can talk. I'm " + this.name + ".";
	}

	@Override
	public String eat() {
		return this.name + " eat birds food.";
	}
}