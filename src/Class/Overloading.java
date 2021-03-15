package Class;

public class Overloading {
    // overloading method mean same method name but different parameters and different work flow
    public String sum(int a, int b) {
        return String.format("%d", a + b);
    }

    public String sum(float a, float b) {
        return String.format("%.2f", a + b);
    }

    public String sum(double a, double b) {
        return String.format("%.2f", a + b);
    }
}