/**. Sum A + B
A sum-based project is a great way to get started with Java programming. The project is quite 
simple — the user will input two numbers (which are treated as the variables A and B), and the
 program will add them together and present the sum of A + B. This can help you learn to work with methods and integers
 . JavaTPoint offers a great guide for a Sum A + B project, 
 and working through this type of project can help you become familiar with Java processes.
**/
import java.util.Scanner;
public class Sum {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Enter the first digit: ");

        x = sc.nextInt();
 
        System.out.println("Enter the second digit: ");

        y = sc.nextInt();

        int z = x + y;

        System.out.println("The sum is " + z);

    }
}
