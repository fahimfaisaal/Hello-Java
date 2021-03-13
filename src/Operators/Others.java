package Operators;

public class Others {
    public static void main(String[] args) {
        // instanceof operator
        String str = "Hello i am java";
        boolean result;

        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

        // ternary operator
        int age = 10;

        String isAdult = age >= 18 ? "adult" : "not adult";
        System.out.println("He is " + isAdult + " cause he is " + age);
    }
}