import java.util.*;

public class Reverse {
    public static void reverseLong(long[] array) {
        int len = array.length - 1;
        int operationLen = array.length / 2;

        for (int i = 0; i < operationLen; i++) {
            long swap = array[i];
            array[i] = array[len - i];
            array[len - i] = swap;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();

        long[] numbers = new long[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = input.nextLong();
        }

        Reverse.reverseLong(numbers);

        for (long number: numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\n");
    }
}