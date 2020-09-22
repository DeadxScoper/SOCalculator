package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please Select and input:");
        Scanner input = new Scanner(System.in);
        String operation = input.next().toLowerCase();
        System.out.println("Please put in number 1");
        double number1 = input.nextDouble();
        System.out.println("Please enter the second number ");
        double number2= input.nextDouble();
        switch (operation){
            case "add":
                System.out.println(number1 + number2);
                break;
            case "subtract":
                System.out.println(number1 - number2);
                break;
            case "multiply":
                System.out.println(number1 * number2);
                break;
            case "divide":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Please choose a valid operation");

        }
    }
}
