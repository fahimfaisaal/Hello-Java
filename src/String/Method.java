package String;
import java.util.*;

public class Method {
	public static void main(String[] args) {
		 String hello = "Hello, ";
		 String world = "World!";
		 int length = (hello + world).length();

		 // String concatenation
		 System.out.println("String: " + hello + world);
		 System.out.println("Length: " + length);

		 /*
		  * substring method
		  * syntax of substring method -> string.substring(int startIndex, int endIndex)
		  */
		 String mainStr = "Hello, I am Fahim and i am 22";
		 String subStr = mainStr.substring(7, 17);

		 System.out.println("Main String: " + mainStr);
		 System.out.println("Sub String: " + subStr);

		 /*
		  * replace method
		  * syntax of replace method -> string.replace(char oldChar, char newChar)
		  */
		String palindrome = "madam";
		System.out.println("madam to ladal -> " + palindrome.replace('m', 'l'));

		String javaToJavaScript = "java";
		System.out.println("java to javaScript -> " + javaToJavaScript.replace("java", "javaScript"));

		String lavaToJava = "lava";
		System.out.println("lava to java -> " + lavaToJava.replace('l', 'j'));

		 /*
		  * replaceAll method
		  * syntax of replaceAll method -> string.replaceAll(String regex, String replacement)
		  */
		 String addDash = "API(Application programming Interface)";
		 System.out.println(addDash.replaceAll(" ", "-"));

		 /*
		  * split method
		  * syntax of split method -> string.split(String regex, int limit)
		  */
		 String str = "Hello, World!";
		 String[] splitStr = str.split("", 5);
		 System.out.println("String to Array -> " + Arrays.toString(splitStr));

		 // now we can access the char by calling index
		 System.out.println("on 0 index = " + splitStr[0]);
		 System.out.println("on last index = " + splitStr[splitStr.length - 1]);

		 /*
		  * toLowerCase method
		  * syntax of toLowercase method -> string.toLowerCase()
		  */
		 String toLower = "HELLO, I AM FAHIM FAISAL";
		 System.out.println(toLower.toLowerCase());

		 /*
		  * toUpperCase method
		  * syntax of toUpperCase method -> string.toUpperCase()
		  */
		 String toUpper = "hello, i am fahim faisal";
		 System.out.println(toUpper.toUpperCase());
	}
}
