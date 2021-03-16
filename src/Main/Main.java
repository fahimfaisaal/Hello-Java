package Main;
import Class.Constructor;
import Class.House;
import AccessModifer.Modifier;

public class Main {
    public static void main(String[] args) {
        // Build myHouse object
        House myHouse = new House("Fahim Faisal", "fahimfaisal.soikot@gmail.com");

        System.out.println("Before set -> " + myHouse.getOwnerGmail());
        myHouse.setOwnerGmail("mdsoikot678@gmail.com");
        System.out.println("After set -> " + myHouse.getOwnerGmail());

        // Build myConstructor object
        Constructor myConstructor = new Constructor("Fahim Faisal", 22);

        System.out.println("My name is " + myConstructor.name);
        System.out.println("The object is -> " + myConstructor.toString());

        Modifier modifier = new Modifier();

        // public variable
        System.out.println(modifier.publicVariable);

        // public method
        System.out.println(modifier.publicMethod());

        // private variable
        modifier.setPrivateVariable("Hello, I'm private Variable.");
        System.out.println(modifier.getPrivateVariable());
    }
}
