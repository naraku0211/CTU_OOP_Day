package inheritance;

public class Askal extends Dog{
    
    static Askal askal1 = new Askal();
    static Dog askal2 = new Askal();
    //static Askal askal3 = new Dog();
    
    public static void main(String[] args) {
        askal1.bark();
        askal2.bark();
    }
    
    @Override
    public void bark(){
        System.out.println("Askal is barking awawawawaw....");
    }
}
