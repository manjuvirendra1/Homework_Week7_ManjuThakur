package week7homework;

import java.util.Scanner;

/**
 * 2.Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme2 {

    public void myYear() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
            in.close();
        }
    }
         public static void main(String [] args) { //main method
         Programme2 obj = new Programme2();
           obj.myYear(); ////calling instance method into main method
    }
    }
