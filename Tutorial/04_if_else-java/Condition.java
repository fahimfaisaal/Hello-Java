import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte age = input.nextByte();
        String status;

        if (age < 9 && age > -1) {
            status = "child";
        } else if (age > 8 && age < 18) {
            status = "teen ager";
        } else if (age > 17 && age < 50) {
            status = "adult";
        } else {
            status = "old";
        }

        System.out.println("He is " + status);
    }
}