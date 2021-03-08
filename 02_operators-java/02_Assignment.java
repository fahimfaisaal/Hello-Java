public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        int var;

        var = a;
        System.out.println("var using = : " + var);

        // += -= *= /= %= <- are compound assignment operator
        var += a; // var = var + a;
        System.out.println("var using += : " + var);

        var -= a; // var = var - a;
        System.out.println("var using -= : " + var);

        var *= a; // var = var * a;
        System.out.println("var using *= : " + var);

        var /= a; // var = var / a;
        System.out.println("var using /= : " + var);

        var %= a; // var = var % a;
        System.out.println("var using %= : " + var);
    }
}