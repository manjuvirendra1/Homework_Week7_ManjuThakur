package week7homework;
import java.util.Scanner;
/**
 *7.Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then find this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Programme7 {
    public void sales() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Please enter your sales ID: ");
        int salesID = scan.nextInt();

        System.out.print("Please enter seller's name: ");
        String sName = scan.next();

        System.out.print("Please enter the Sales amount: ");
        int sales = scan.nextInt();

        System.out.print("Please enter your basic salary: ");
        int basic = scan.nextInt();

        int comm;

        if (sales >= 50000) {
            comm = sales * 35 / 100;
            System.out.println("Your commission is :" + comm);
        } else if (sales >= 30000) {
            comm = sales * 20 / 100;
            System.out.println(("Your commission is: " + comm));
        } else if (sales >= 20000) {
            comm = sales * 10 / 100;
            System.out.println("Your commission is: " + comm);
        } else if (sales >= 10000) {
            comm = sales * 5 / 100;
            System.out.println("Your commission is: " + comm);
        } else if (sales < 10000) {
            comm = sales * 2 / 100;
            System.out.println("Your commission is: " + comm);
        } else {
            System.out.println("Thank you for taking part");
            scan.close();
        }

    }

    public static void main(String[] args) {//main method
        Programme7 obj = new Programme7();
        obj.sales();//calling instance method into main method

    }
}
