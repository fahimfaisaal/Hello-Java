package Main;
import Generics.Generics;
import TestGen.TestGen;

public class Main {
    public static void main(String[] args) {
/*        // Build myHouse object
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

        // private method
        System.out.println(modifier.getPrivateMethod());

        // protected variable
        ProtectedModifier protectedModifier = new ProtectedModifier();

        protectedModifier.protectedMethodVariable();

        // final keyword
        FinalVariable finalVar = new FinalVariable();

        System.out.println("Constant integer = " + finalVar.constantA);
        System.out.println("Constant float = " + finalVar.constantB);
        System.out.println("Constant Long = " + finalVar.constantC);
        System.out.println("Constant String = " + finalVar.constantD);

        // extends class (Inheritance)
        System.out.println("Inheritance -->");
        Dog dog = new Dog("dog", 4, true, false);

        System.out.println("extends the super class methods (Animal) ->");
        System.out.println(dog.displayName());
        System.out.println(dog.numberOfLegs());
        System.out.println(dog.haveTail());
        System.out.println(dog.canFly());
        System.out.println("____________");

        // call the override method
        System.out.println("override method = " + dog.eat());

        // new method of dog class
        System.out.println("new method = " + dog.canBark());

        System.out.println("Parrot class ->");

        Parrot parrot = new Parrot("parrot", 2, false, true);

        System.out.println("Override method -> " + parrot.eat());
        System.out.println("New method in parrot class -> " + parrot.canTalk());

        System.out.println("Inheritance methods of animal ->");
        System.out.println(parrot.displayName());
        System.out.println(parrot.numberOfLegs());
        System.out.println(parrot.canFly());
        System.out.println(parrot.haveTail());

        System.out.println("---------");
        System.out.println("Super Class ->");

        SuperClass Super = new SuperClass();
        System.out.println(Super.displayType());

        System.out.println("Sub Class ->");
        SubClass sub = new SubClass();
        System.out.println(sub.displayType());

        sub.printSuperMethod();
        sub.printSuperValue();

        System.out.println("___Abstraction___");

        System.out.println(Abstract.myBio());
        System.out.println(Abstract.whatIDo());*/


        // Dynamic type with generics
        Generics<Integer> gen1 = new Generics<>(22);
        Generics<Character> gen2 = new Generics<>('F');
        Generics<String> gen3 = new Generics<>("Fahim Faisal");
        Generics<Boolean> gen4 = new Generics<>(true);
        Generics<TestGen> gen5 = new Generics<>(new TestGen("Hello user!"));

        System.out.println("Integer: "  + gen1.getGen());
        System.out.println("Character: " + gen2.getGen());
        System.out.println("String: " + gen3.getGen());
        System.out.println("Boolean: " + gen4.getGen());
        System.out.println("Test Generics: " + gen5.getGen().getMessage());

    }
}
