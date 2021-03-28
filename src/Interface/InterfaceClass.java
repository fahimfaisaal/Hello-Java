package Interface;

interface A {
	public void interfaceA();
}

interface B {
	public void interfaceB();
}

class InterfaceClass implements A, B{
	public void interfaceA() {
		System.out.println("I am interface A");
	}

	public void interfaceB() {
		System.out.println("I am interface B");
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