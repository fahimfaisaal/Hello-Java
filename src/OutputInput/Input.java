package OutputInput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input integer number
        System.out.println("Input Integer number");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a + b);

        // Input floating number
        System.out.println("Input Floating number");

        float a1 = input.nextFloat();
        float b1 = input.nextFloat();

        System.out.printf("%.2f + %.2f = %.2f\n", a1, b1, a1 + b1);

        // Input Double number
        System.out.println("Input Double number");

        double a2 = input.nextDouble();
        System.out.println(a2);

        // input String
        System.out.print("Input a text: ");

        String str = input.next();

        System.out.println("Your text : " + str);

        input.close();
    }
}