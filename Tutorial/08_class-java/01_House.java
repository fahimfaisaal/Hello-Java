public class House {
    public String owner = "Fahim Faisal";

    public void door() {
        System.out.println("This is my main door");
    }

    public void window() {
        System.out.println("This is window");
    }

    public void kitchen() {
        System.out.println("This is my kitchen");
    }

    public void dining() {
        System.out.println("This is my dining");
    }

    public static void main(String[] args) {
        House myHouse = new House();

        // access property
        System.out.println("Hello, I'm " + myHouse.owner + ". This is my house.");

        // call methods
        myHouse.door();
        myHouse.window();
        myHouse.kitchen();
        myHouse.dining();
    }
}