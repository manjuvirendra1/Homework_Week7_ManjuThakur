package week7homework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {
    public void myNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");//enter first number
        int firstNum = scan.nextInt();
        System.out.println("Input the second number");//enter second number
        int secondNum = scan.nextInt();

        System.out.println("Please enter the symbol20 to perform operation");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            System.out.println("Addition of two numbers is:" + (firstNum + secondNum));//addition
        } else if (operation == '-') {
            System.out.println("Subtraction of two numbers is:" + (firstNum - secondNum));//subtraction
        } else if (operation == '*') {
            System.out.println("Multiplication of two numbers is:" + (firstNum * secondNum));//multiplication
        } else if (operation == '/') {
            System.out.println("Division of two numbers is: " + (firstNum / secondNum));//division
            scan.close();
        }
    }

    public static void main(String [] args) {
        Programme10 obj = new Programme10();
        obj.myNumbers();
    }
}


