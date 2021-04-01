package Interface;

interface A {
	public void interfaceA();
}

interface B {
	public void interfaceB();
}

interface C {
	public void interfaceC();
}

class InterfaceClass implements A, B, C {
	public void interfaceA() {
		System.out.println("I am interface A");
	}

	public void interfaceB() {
		System.out.println("I am interface B");
	}

	public void interfaceC() {
		System.out.println("Hello i am interface c.");
	}
}

class Rectangle implements Polygon {
	public long getArea(int length, int breadth) {
		return (long) length * breadth;
	}
}

class Main {
	public static void main(String[] args) {
		InterfaceClass interfaceClass = new InterfaceClass();
		Rectangle rect1 = new Rectangle();

		interfaceClass.interfaceA();
		interfaceClass.interfaceB();
		System.out.println(rect1.getArea(4, 20));
	}
}