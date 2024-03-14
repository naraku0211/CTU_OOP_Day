package main;


public class PolymorphismChildClass extends PolymorphismParentClass{

    public PolymorphismChildClass() {
    }

    public PolymorphismChildClass(int intPoly1, int intPoly2) {
        super(intPoly1, intPoly2);
    }
    
    @Override
    public void displayStringPoly(String poly1, String poly2, String poly3) {
        //super.displayStringPoly(poly1, poly2, poly3); 
        System.out.printf("Value of poly1, poly2 and poly3: %s, %s and %s\n",poly1,
               poly2, poly3 );
    }
    
    public double squaredPolies(){
        return Math.pow(super.sumIntPolies(getIntPoly1(), getIntPoly2()), 2);
    }
    
}
