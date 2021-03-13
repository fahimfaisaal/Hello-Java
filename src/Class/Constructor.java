package Class;

public class Constructor {
	 private String name;

	 // no args constructor
//	 Constructor() {
//	 	 // this is constructor
//		  System.out.println("Constructor is called");
//		  name = "Fahim Faisaal";
//	 }

	 // args constructor
	 Constructor(String myName) {
	 	 name = myName;
	 	 System.out.println("My name is " + myName);
	 }

	 public static void main(String[] args) {
	 	 Constructor obj = new Constructor("Fahim Faisaal");
	 	 System.out.println("I am " + obj.name);
	 }
}