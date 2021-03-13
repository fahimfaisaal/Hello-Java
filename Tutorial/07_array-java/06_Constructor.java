public class Constructor {
	 private String name;

	 Constructor() {
	 	 // this is constructor
		  System.out.println("Constructor is called");
		  name = "Fahim Faisaal";
	 }

	 public static void main(String[] args) {
	 	 Constructor obj = new Constructor();
	 	 System.out.println("I am " + obj.name);
	 }
}