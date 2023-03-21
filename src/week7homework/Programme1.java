package week7homework;
import java.util.Scanner;
/**
 *1.Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

public class Programme1 {

    public void myNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scan.nextInt();
        scan.close();
        //ternary operator to check number
        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
    public static void main(String[] args) {//main method
         Programme1 obj = new Programme1();
           obj.myNumber(); //calling instance method into main method
    }

}