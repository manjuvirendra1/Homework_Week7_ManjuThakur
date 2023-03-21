package week7homework;
import java.util.Scanner;
/**
 *11 Write a java program to print the numbers between1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme11 {
    public void numBetween() {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Range of the number between 1 to 100: ");
        n = scanner.nextInt();

        System.out.println("Divided by : 3");
        for (int i = 1; i <= 100; i++) {
            if(i%3==0) System.out.print(i+", ");
        }
        System.out.println("\nDivided by : 5");
        for (int i = 1; i <= 100; i++) {
            if(i%5==0) System.out.print(i+", ");
        }
        System.out.println("\nDivided by : 3 & 5");
        for (int i = 1; i <= 100; i++) {
            if(i%3==0 && i%5==0) System.out.print(i+", ");
            scanner.close();
        }

    }
    public static void main(String[] args) {
        Programme11 obj = new Programme11();
        obj.numBetween();
    }
}




