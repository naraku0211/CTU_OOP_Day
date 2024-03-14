package test;

import main.*;

public class PolymorphismTest {
    
    public static void main(String[] args) {
        
        PolymorphismChildClass childClass = new PolymorphismChildClass();
        childClass.setPoly1("Hello, I'm poly1.");
        childClass.setPoly2("Hi, I'm poly2.");
        childClass.displayStringPoly();
        childClass.displayStringPoly("Hi", "Hello", "");
        
        PolymorphismParentClass parentClass = new PolymorphismParentClass();
        parentClass.displayStringPoly();
        parentClass.displayStringPoly("Hi", "Hello", "");
        
        PolymorphismParentClass class1 = new PolymorphismChildClass();
        class1.setPoly1("Hi, Hello...");
        class1.displayStringPoly();
        class1.displayStringPoly("Hi", "Hello", "CTU");
        
        childClass.setIntPoly1(5);
        childClass.setIntPoly2(10);
        System.out.println("Product: " + childClass.squaredPolies());
    }
    
}
