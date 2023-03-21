package week7homework;
import java.util.Scanner;
/**
 *9.Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 *  any other alphabet should be invalid entrySame as above program-8 using switch statement.
 */

public class Programme9 {
    public void city(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any letter = ");
        char city = scan.next().charAt(0);//store memory and using charAt() convert string to char
         String alpha;
        switch (Character.toUpperCase(city)){
            case 'A':
                System.out.println("Your city name is Ahmedabad");
                break;
            case 'B':
                System.out.println("Your city name is Baroda");
                break;
            case 'C':
                System.out.println("Your city name is Calcutta");
                break;
            case 'D':
                System.out.println("Your city name is Delhi");
                break;
            case 'E':
                System.out.println("Your city name is Edinburgh");
                break;
            case 'F':
                System.out.println("Your city name is Florida");
                break;
            default:
                System.out.println("Invalid entry");//a to f only valid entry, after f is invalid
                scan.close();
        }
    }
    public static void main(String[] args) {//main method
        Programme9 obj = new Programme9();
        obj.city();//calling instance method into main method
    }
}


