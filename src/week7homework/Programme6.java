package week7homework;
import java.util.Scanner;
/**
 *6.Write a java program to input any number and find out if it’s odd or even
 */

public class Programme6 {
    public void oddeven(){
        //calling scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter any number to know if it's even or odd: ");
        int num = scan.nextInt();
        if (num%2==0){
            System.out.println(num +" is Even number");
        } else System.out.println(num + " Is Odd number");
        scan.close();
    }

    public static void main(String[] args) {
        Programme6 obj = new Programme6();
        obj.oddeven();
    }
}