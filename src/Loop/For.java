package Loop;

public class For {
    public static void main(String[] args) {
        System.out.println("Increment: ");
        for (int i = 1; i < 6; ++i) { // also can use postfix i++ or i--
            System.out.println(i + " Java is awesome");
        }

        System.out.println("Decrement: ");
        for (int i = 5; i > 0; --i) {
            System.out.println(i + " Java is awesome");
        }

        System.out.println("For each loop: ");
        int[] numbers = {6, 7, 8, 9, 10};

        // java for each loop
        for (int number: numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Total sum of array is => " + sum + "\n" + "The Vowels are -> ");

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel: vowels) {
            System.out.printf("%c ", vowel);
        }
        System.out.print('\n');
    }
}