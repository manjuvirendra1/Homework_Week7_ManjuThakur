package week7homework;
import java.util.Scanner;
/**
 *12.Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12 {
        public void myValue() {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter anything from keyboard to know what you entered: ");
                char key = scan.next().charAt(0);
                System.out.println(key >= 'a' && key <= 'z' ? "Small case alphabet"
                        : key >= 'A' && key <= 'Z' ? "Capital Alphabet"
                        :key>='0'&&key<='9' ? "Digit"
                        :"Symbol");
                scan.close();

        }
        public static void main(String[] args) {//main method
                Programme12 obj = new Programme12();
                obj.myValue();//calling instance method into main method
        }
}



