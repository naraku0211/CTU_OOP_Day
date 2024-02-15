package main;

import java.util.Scanner;


public class Main {
    
    static Scanner inputData = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Input value1: ");
        int value1 = inputData.nextInt();
        
        //do-while loop (initialization, condition, updation)
        //pre - implementary loop
        do{
            System.out.println("Hello World!!!");
            value1++; //value = value + 1
        }while(value1<=5);
        
        
        System.out.print("Input value2: ");
        int value2 = inputData.nextInt();
        //while loop
        //post - implementary loop
        while(value2<=5){
            System.out.println("Hello Java");
            value2++;
        }
        
        System.out.print("Input value3: ");
        int value3 = inputData.nextInt();
        //for loop
        for(int i = value3; value3 <= 5; value3++){
            System.out.println("Hello For Loop!!!");
        }
        
        //for-each loop
        //loop for arrays
        
        int[] value4 = {1, 2, 3, 4, 5};
        for (int i : value4) { //i[0] = 1, i[1] = 2, i[2] = 3, i[3] = 4, i[4] = 5
            if(i<3)
                System.out.println(i);
        }
        
    }
    
}
