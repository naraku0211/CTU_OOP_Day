package main;

import java.util.Scanner;


public class CTUSample {

    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.println("Name 1: " + name);
        System.out.print("Input value: ");
        int value1 = input.nextInt();
        System.out.println("Value 1: " + value1);
        
    }
    
}
