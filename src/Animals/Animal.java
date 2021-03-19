package Animals;

public class Animal {
	public final String name;
	private int numberOfLegs;
	private boolean tail;
	private boolean canFly;

	public Animal(String name, int numberOfLegs, boolean tail, boolean canFly) {
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.tail = tail;
		this.canFly = canFly;
	}

	public final String displayName() {
		return "This is a " + this.name;
	}

	public final String canFly() {
		return "It's can" + (this.canFly ? "" : "'t") + " fly";
	}

	public final String numberOfLegs() {
		return "It's have " + this.numberOfLegs + " legs";
	}

	public final String haveTail() {
		return "It's have" + (tail ? " a" : "n't") + " tail";
	}

	public String eat() {
		return this.name + " can eat";
	}
}