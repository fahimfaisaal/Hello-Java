package Operators;

public class Unary {
    public static void main(String[] args) {
        char a = '1';

        // Unary + operator
        System.out.println(+a); // it's return a ASCII code cause it's converted to number

        // Unary - operator
        System.out.println(-a); // it's return a ASCII code cause it's converted to negative number

        int b = 1;

        // prefix ++ -- it's will increament and decrement in the existing line
        System.out.println(++b);
        System.out.println(--b);

        // postfix ++ -- it's increment and decrement after one line
        System.out.println("time of increament " + b++);
        System.out.println("after increment " + b);

        System.out.println("time of decrement " + b--);
        System.out.println("after decrement " + b);
    }
}