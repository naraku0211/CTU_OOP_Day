package main;

public class PolymorphismParentClass {
    
    private String poly1, poly2, poly3;
    private int intPoly1, intPoly2;

    public PolymorphismParentClass() {
    }

    public PolymorphismParentClass(String poly1, String poly2, String poly3) {
        this.poly1 = poly1;
        this.poly2 = poly2;
        this.poly3 = poly3;
    }

    public PolymorphismParentClass(int intPoly1, int intPoly2) {
        this.intPoly1 = intPoly1;
        this.intPoly2 = intPoly2;
    }

    public PolymorphismParentClass(String poly1, String poly2, String poly3, int intPoly1, int intPoly2) {
        this.poly1 = poly1;
        this.poly2 = poly2;
        this.poly3 = poly3;
        this.intPoly1 = intPoly1;
        this.intPoly2 = intPoly2;
    }

    public String getPoly1() {
        return poly1;
    }

    public void setPoly1(String poly1) {
        this.poly1 = poly1;
    }

    public String getPoly2() {
        return poly2;
    }

    public void setPoly2(String poly2) {
        this.poly2 = poly2;
    }

    public String getPoly3() {
        return poly3;
    }

    public void setPoly3(String poly3) {
        this.poly3 = poly3;
    }

    public int getIntPoly1() {
        return intPoly1;
    }

    public void setIntPoly1(int intPoly1) {
        this.intPoly1 = intPoly1;
    }

    public int getIntPoly2() {
        return intPoly2;
    }

    public void setIntPoly2(int intPoly2) {
        this.intPoly2 = intPoly2;
    }
    
    public void displayStringPoly(){
        System.out.println("Value of poly1: " + getPoly1() + "\nValue of poly2: "
                + getPoly2() + "\nValue of poly3: " + getPoly3());
    }
    
    public void displayStringPoly(String poly1, String poly2, String poly3){
        
    }
    
    public int sumIntPolies(int intPoly1, int intPoly2){
        return intPoly1 + intPoly2;
    }
}
