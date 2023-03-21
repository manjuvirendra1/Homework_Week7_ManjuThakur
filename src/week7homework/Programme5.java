package week7homework;
import java.util.Scanner;
/**
 * 5.WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

public class Programme5 {
    public void salaryslip() {
        //calling scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter employee ID: ");
        int empID = scan.nextInt();

        System.out.print("Please enter employee name: ");
        String empName = scan.next();

        System.out.print("Please enter basic Salary: ");
        double basic = scan.nextDouble();

        double hra = basic * 10 / 100;//basic salary 10%
        double da = basic * 8 / 100;//basic salary 8%
        double ta = basic * 9 / 100;//basic salary 9%
        double pf = basic * 20 / 100;//basic salary 20%
        double gross = basic + hra + ta + da - pf;//Gross salary = basic salary + HRA + TA + DA –PF

        System.out.println("_________________________________________");
        System.out.println("|          Salary Slip                   |");
        System.out.println("|________________________________________|");
        System.out.println("| Employee Id   :" + empID + "                    |");
        System.out.println("| Employee Name :" + empName + "                     |");
        System.out.println("|________________________________________|");
        System.out.println("| Basic Salary  :" + basic + "                 |");
        System.out.println("| HRA 10%       :" + hra + "                  |");
        System.out.println("| TA 8%         :" + ta + "                  |");
        System.out.println("| DA 9%         :" + da + "                  |");
        System.out.println("| PF - 20&      :" + pf + "                  |");
        System.out.println("|________________________________________|");
        System.out.println("| Gross Salary  :" + gross + "                 |");
        System.out.println("|=======================================+|");
        scan.close();
    }

    public static void main(String[] args) {//main method
        Programme5 obj = new Programme5();
        obj.salaryslip();//calling instance method into main method
    }
}

