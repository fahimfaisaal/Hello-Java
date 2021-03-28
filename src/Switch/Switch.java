package Switch;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Day Start 0 to 6");

        // day generator
        int dayNumber = Math.abs(input.nextInt());
        String day = switch (dayNumber) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Thursday";
            case 4 -> "Wednesday";
            case 5 -> "Tuesday";
            case 6 -> "Friday";
            default -> "None (Invalid input)";
        };

        //* use also core switch
        /*
        switch (dayNumber) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Thursday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Tuesday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                day = "None (Invalid input)";
        }
        */

        System.out.println("The day is " + day);
        input.close();
    }
}