package week7homework;
import java.util.Scanner;
/**
 *16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Programme16 {

    public void myNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
          in.close();

        }
    } public static void main(String[] args) {//main method
              Programme16 obj = new Programme16();
              obj.myNumbers();//calling instance method into main method
    }
}