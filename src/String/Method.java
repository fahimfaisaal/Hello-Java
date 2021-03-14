package String;

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
	}
}
