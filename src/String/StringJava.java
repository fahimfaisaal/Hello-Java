package String;
import java.util.*;

public class StringJava {
	 String name;
	 String age;
	 String religion;

	 StringJava(String myName, String myAge, String myReligion) {
	 	 name = myName;
	 	 age = myAge;
	 	 religion = myReligion;
	 }

	 public boolean isMatch(String str1, String str2) {
	 	 return str1.equals(str2);
	 }

	 public static void main(String[] args) {
	 	 Scanner scan = new Scanner(System.in);

	 	  System.out.print("Enter your name: ");
		  String name = scan.nextLine();

		  System.out.print("Enter your age: ");
		  String age = scan.next();

		  System.out.print("Enter your religion: ");
		  String religion = scan.next();

		  scan.close();

		  StringJava stringObj = new StringJava(name, age, religion);

		  String myBio = "Hello, I am ";
		  String myAge = "I am ";
		  String myReligion = " and my religion is ";

		  System.out.println(myBio.concat(stringObj.name));
		  System.out.print(myAge.concat(stringObj.age));
		  System.out.println(myReligion.concat(stringObj.religion));

		  System.out.println("Check Equality");

		  String str1 = "java programming";
		  String str2 = "java programming";
		  String str3 = "javaScript programming";

		  System.out.println(stringObj.isMatch(str1, str2));
		  System.out.println(stringObj.isMatch(str2, str3));

		  // we can create a string also using new key word
		  String newString = new String("Hello Java");
		  System.out.println(newString);
	 }
}
