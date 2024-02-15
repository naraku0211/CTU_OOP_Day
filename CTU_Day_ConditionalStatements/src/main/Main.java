package main;

import java.util.Scanner;

public class Main {
    
    static Scanner inputData = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.print("Input value: ");
        int value = inputData.nextInt();
        //System.out.println(value);
        
        //if condition
        if(value == 5){
            System.out.println("Hello World!!!");
        }
        
        //if-else condition
        if(value == 10){
            System.out.println("Hello Java!!");
        }
        else{
            System.err.println("The value inputted is not 10.");
        }
        
        String place, food;
        //nested if-else condition
        if(value == 20){
            System.out.print("Enter place: ");
            place = inputData.next();
            if(place.equals("cebu")){
                System.out.println(place);
            }
        }
        else{
            System.out.print("Enter food: ");
            food = inputData.next();
            if(food.equals("chickenjoy")){
                System.out.println(food);
            }
            else{
                System.err.println("You enter the wrong food.");
            }
        }
        
        //switch statement
        //case values: integers, characters, strings, boolean
        switch(value){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                break;          
        }
    }
}
