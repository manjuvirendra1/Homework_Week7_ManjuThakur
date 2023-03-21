package week7homework;
import java.util.Scanner;
/**
 *4.Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above
 */

public class Programme4 {

    public static boolean isLeapYear( int year){ //static method with one param
        if((year <1) || (year > 9999)){
            return false;
        }
        else if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){//year is a leap year if divisible by 4,400 but not by 100
            return true;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year){//static method with two params
        if((((month< 1) || (month >12) || (year < 1) || (year > 9999)))){
            return -1;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)){
                    return 29;
                }else
                    return 28;
        }
        return -1;
    }
    public static void main(String[] args) { //main method
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2021));

    }
}