package AbstractJava;

abstract class Animal {
	abstract String makeSound();
	abstract String myBio();
}

class Dog extends Animal {
	public String makeSound() {
		return "Bark! Bark!";
	}

	public String myBio() {
		return "I am Dog";
	}
}

class Cat extends Animal {
	public String makeSound() {
		return "Meows";
	}

	public String myBio() {
		return "I am Cat";
	}
}

class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();

		System.out.println(dog.myBio());
		System.out.println(dog.makeSound());

		Cat cat = new Cat();

		System.out.println(cat.myBio());
		System.out.println(cat.makeSound());
	}
}