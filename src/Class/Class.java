package Class;

public class Class {
    public int a = 10;
    public int b = 20;

    public int sum2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // create a instance object form Class class
        Class obj = new Class();

        // access property
        System.out.println(obj.a);
        System.out.println(obj.b);

        // access method
        int sum = obj.sum2(10, 20);
        System.out.println("The sum is = " + sum);
    }
}