package Mains.args;
import java.util.*;

public class MainArgs {
    public static void main(String[] args) {
        for (String item: args) {
            System.out.println(item);
        }

        System.out.println(Arrays.toString(args));
    }
}