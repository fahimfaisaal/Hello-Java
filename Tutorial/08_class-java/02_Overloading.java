class Overloading {
    // overloading method mean same method name but diffrent parameters and different work flow
    private String sum(int a, int b) {
        return String.format("%d", a + b);
    }

    private String sum(float a, float b) {
        return String.format("%.2f", a + b);
    }

    private String sum(double a, double b) {
        return String.format("%.2f", a + b);
    }

    public static void main(String[] args) {
        Overloading overloadedMethod = new Overloading();

        String integerSum = overloadedMethod.sum(10, 5);
        String floatSum = overloadedMethod.sum(20.200, 40.555);
        String doubleSum = overloadedMethod.sum(1000.2002, 20000.45632);

        System.out.println("Integer Sum = " + integerSum);
        System.out.println("Float Sum = " + floatSum);
        System.out.println("Double Sum = " + doubleSum);
    }
}