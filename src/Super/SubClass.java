package Super;

public class SubClass extends SuperClass {
	protected String type = "Human";

	public String displayType() {
		return "I am " + this.type + ".";
	}

	public void printSuperMethod() {
		System.out.println(super.displayType());
	}

	public void printSuperValue() {
		System.out.println("super type = " + super.type);
	}
}
