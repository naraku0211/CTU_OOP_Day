package ctu_day_exceptions;

import java.util.Scanner;
import test.DivisionByZero;


public class CTU_Day_Exceptions {


    public static void main(String[] args) {
        
        Scanner inputData = new Scanner(System.in);
        switch(inputData.nextInt()){
            case 1:
                System.out.print("Enter dividend and divisor (integer): ");
                DivisionByZero test1 = new DivisionByZero(inputData.nextInt(), inputData.nextInt());
                System.out.println("Quotient: " + test1.intQuotient());
                break;
            case 2:
                System.out.println("Enter dividend and divisor (double): ");
                DivisionByZero test2 = new DivisionByZero(inputData.nextDouble(), inputData.nextDouble());
                System.out.println("Quotient: " + test2.doubleQuotient());
            default:
                break;
                    
        }
        
        
    }
    
}
