package week7homework;
import java.util.Scanner;
/**
 *3.Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between0 to 100 and if it is out of range print error message Invalid
 * Input, Marks should (between0 to 100) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class Programme3 {
    //instance variable
    int total;
    double rec;

    public static void main(String[] args)
    {
        //scanner calling
        System.out.println("          Mark Sheet        ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Name = ");
        String name = scanner.next();
        System.out.print("Enter a Student RollNo = ");
        int no = scanner.nextInt();
        System.out.println("Enter Maths subject marks = ");
        int math = scanner.nextInt();
        System.out.println("Enter Science subject marks = ");
        int sci = scanner.nextInt();
        System.out.println("Enter English subject marks = ");
        int english = scanner.nextInt();

        //calling instance object
        Programme3 programme3 = new Programme3();
        int result = programme3.total(math, sci, english);
        System.out.println("total= " + result);

        //calling instance object
        double result1 = programme3.per();
        System.out.println("Percentage = " + result1);

        //print Marks sheet
        System.out.println("|--------------------------------------|");
        System.out.println("|               Mark Sheet             |");
        System.out.println("|--------------------------------------|" );
        System.out.println("|RollNo.         : "               +no+"                   |");
        System.out.println("|Student Name    : "             +name +"                 |");
        System.out.println("|--------------------------------------|");
        System.out.println("|   Subject      :       Mark          |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Maths           : "            +math +"                  |");
        System.out.println("|Science         : "          +sci  +"                  |");
        System.out.println("|English         : "         +english +"                  |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Total           : "        + result +"                 |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Percentage      : "       + result1 +"                |");
        programme3.result();//calling object
        System.out.println("|--------------------------------------|");

        scanner.close();
    }

    //instance method
    public int total(int m, int s, int e)
    {
        total = m + s + e;
        return total;
    }

    //instance method
    public double per()
    {
        rec = total/3;
        return rec;
    }

    //instance method
    public void result()
    {
        if (rec >= 80)
        {

            System.out.println("|Result          : Pass                |");
            System.out.println("|Grade           : A+                  |");

        }
        else if (rec < 80 && rec >=60)
        {
            System.out.println("|Result          : Pass                |");
            System.out.println("|Grade           : A                   |");
        }
        else if (rec < 60 && rec >= 50)
        {
            System.out.println("|Result          : Pass                |");
            System.out.println("|Grade           : B                   |");
        }
        else if( rec < 50 && rec >= 35)
        {
            System.out.println("|Result          : Pass                |");
            System.out.println("|Grade           : C                   |");
        }
        else
        {
            System.out.println("|Result          : Fail                |");
        }
    }
}

