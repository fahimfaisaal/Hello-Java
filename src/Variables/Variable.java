package Variables;

public class Variable {
	public static void main(String[] args) {
		// boolean variable (Size -> 1 bit (Range -> true, false) Default -> false)
		boolean truthyValue = true;
		boolean falsyValue = false;

		System.out.println(truthyValue);
		System.out.println(falsyValue);

		// byte variable (Size -> 1 Byte (8 bits) Range of value -> -128 to 127 Default -> 0)
		byte byteVar = 123;
		System.out.println(byteVar);

		// short variable (Size -> 2 Byte (16 bits) Range of value -> -32768 to 32768 Default -> 0)
		short shortVar = 30000;
		System.out.println(shortVar);

		// integer variable (Size -> 4 Byte (32 bits) Range of value -> -2147483648 to 2147483648 Default -> 0)
		int integerValue = 19;
		System.out.println(integerValue);

		// long variable (Size -> 8 Byte (64 bits) Default -> 0)
		long longValue = 12334567891011L;
		System.out.println(longValue);

		// floating variable (Size -> 4 Byte (32 bits) Default -> 0.0)
		float floatingValue = 19.5F;
		System.out.println(floatingValue);

		// double variable (Size -> 8 Byte (64 bits) Default -> 0.0)
		double doubleValue = 19999.555e2;
		System.out.println(doubleValue);

		// char variable (Size -> 2 Byte (16 bits) Default -> \u0000)
		char a = 'a';
		char A = 'A';

		System.out.println(a);
		System.out.println(A);

		// string variable
		String str1 = "Hello java";
		String str2 = "Java is awesome";

		System.out.println(str1);
		System.out.println(str2);
	}
}