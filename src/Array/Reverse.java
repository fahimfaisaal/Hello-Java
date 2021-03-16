package Array;
import java.util.*;

public class Reverse {
    public static void reverseLong(String[] array) {
        int len = array.length - 1;
        int operationLen = array.length / 2;

        for (int i = 0; i < operationLen; i++) {
            String swap = array[i];
            array[i] = array[len - i];
            array[len - i] = swap;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();

        String[] items = new String[len];
        for (int i = 0; i < len; i++) {
            items[i] = input.next();
        }

        Reverse.reverseLong(items);

        for (String item: items) {
            System.out.print(item + " ");
        }

        System.out.print("\n");
    }
}