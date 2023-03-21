package week7homework;

import java.util.Scanner;

/**
 * 8.Input any alphabet from A to F and print their city name accordingly (use if else), if
 * any other alphabet should be invalid entry
 */

public class Programme8 {
    public void alphabet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter = ");
        String city = scanner.nextLine();
              // A to F city names
        if (city.equalsIgnoreCase("a")) {
            System.out.println("Antalya");
        } else if (city.equalsIgnoreCase("b")) {
            System.out.println("Boston");
        } else if (city.equalsIgnoreCase("c")) {
            System.out.println("Cardiff");
        } else if (city.equalsIgnoreCase("d")) {
            System.out.println("Dubai");
        } else if (city.equalsIgnoreCase("e")) {
            System.out.println("Edinburgh");
        } else if (city.equalsIgnoreCase("f")) {
            System.out.println("France");
        } else {
            System.out.println("Invalid Entry"); //Invalid entry after F
        }
        scanner.close();
    }

        public static void main(String[] args) {
          Programme8 obj = new Programme8();  //calling Instance method into main method
              obj.alphabet();
    }

}