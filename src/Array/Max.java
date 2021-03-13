package Array;
import java.util.*;

public class Max {
    public static long maxNumber(long[] arr) {
        long max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();

        long[] numbers = new long[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = input.nextLong();
        }

        long result = Max.maxNumber(numbers);
        input.close();
        System.out.println("The max number is = " + result);
    }
}