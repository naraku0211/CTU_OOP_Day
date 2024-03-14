package inheritance;

public class Dog extends Animal{
    
    static Animal dog1 = new Animal();
    static Dog dog2 = new Dog();
    
    public static void main(String[] args) {
        dog1.printAnimalName();
        dog2.printAnimalName();
    }
    
    public void bark(){
        System.out.println("Awwwwwwww....");
    }
}