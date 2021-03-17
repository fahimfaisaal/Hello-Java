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

	// args constructor
	 public Constructor(String name, int age) {
	 	 this.name = name;
	 	 this.age = age;
	 }

	@Override
	public String toString() {
		return "Constructor {" +
				  "name = '" + name + '\'' +
				  ", age = " + age +
				  '}';
	}
}