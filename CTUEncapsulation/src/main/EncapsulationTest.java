package main;

import encapsulation.Encapsulation;
import java.util.Scanner;

public class EncapsulationTest {
    
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        
        Encapsulation e1 = new Encapsulation();
        e1.setVar1("Hello");
        e1.setVar2(" ");
        e1.setVar3("Java");
        
        System.out.println(e1.getVar1() + e1.getVar2() + e1.getVar3());
        
        e1.setVar3("World!!!");
        System.out.println(e1.getVar1() + e1.getVar2() + e1.getVar3());
        
        Encapsulation e2 = new Encapsulation("CPE ", "is ", "challenging.");
        System.out.println(e2.getVar1() + e2.getVar2() + e2.getVar3());
        
        Encapsulation e3 = new Encapsulation(5, 10);
        e3.outputDisplaySum();
        
        //System.out.print("Input Value 1: ");
        //int value1 = inputData.nextInt();
        //System.out.print("Input Value 2: ");
        //int value2 = inputData.nextInt();
        Encapsulation e4 = new Encapsulation();
        e4.setValue1(inputData.nextInt());
        e4.setValue2(inputData.nextInt());
        e4.outputDisplaySum();
    }
}
