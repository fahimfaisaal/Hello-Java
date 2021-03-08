public class Unary {
    public static void main(String[] args) {
        char a = '1';

        // Unary + operator
        System.out.println(+a); // it's return a ASCII code cause it's converted to number

        // Unary - operator
        System.out.println(-a); // it's return a ASCII code cause it's converted to negative number

        int b = 1;

        // prefix ++ -- it's will increament and decrement in the existing line
        System.out.println(++a);
        System.out.println(--a);

        // postfix ++ -- it's increment and decrement after one line
        System.out.println("time of increament " + a++);
        System.out.println("after increment " + a);

        System.out.println("time of decrement " + a--);
        System.out.println("after decrement " + a);
    }
}