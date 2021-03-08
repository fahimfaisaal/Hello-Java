public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical and (&&) operator
        System.out.print("true && true = ");
        System.out.println((a < b) && (b > a));

        System.out.print("true && false = ");
        System.out.println((a < b) && (b < a));

        // Logical or (||) operator
        System.out.print("true || true = ");
        System.out.println((a < b) || (b > a));

        System.out.print("true || false = ");
        System.out.println((a < b) || (b < a));

        System.out.print("false || false = ");
        System.out.println((a > b) || (b < a));

        // Logical not (!) operator
        System.out.print("false = ");
        System.out.println(!(a == b));

        System.out.print("true = ");
        System.out.println(!(a < b));
    }
}