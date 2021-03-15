package Class;

public class Constructor {
	 public String name;
	 public int age;

	 // no args constructor
//	 Constructor() {
//	 	 // this is constructor
//		  System.out.println("Constructor is called");
//		  name = "Fahim Faisaal";
//	 }


	@Override
	public String toString() {
		return "Constructor {" +
				"name = '" + name + '\'' +
				", age = " + age +
				'}';
	}

	// args constructor
	 public Constructor(String myName, int myAge) {
	 	 name = myName;
	 	 age = myAge;
	 }
}