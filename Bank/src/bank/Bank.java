
package bank;
//import java.util.Scanner;

//import java.lang.Object;
//import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author MICOLE
 */
public class Bank {

  
    public static void main(String[] args) throws IOException{
        int recentBalance = 600;
        System.out.println("Hello world!");
        System.out.println("Enter a Choice");
        System.out.println("A: Checking Account");
        System.out.println("B: Saving Account");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();

        if ("A".equalsIgnoreCase(s)) {
            System.out.println("Checkings Account");
            CheckingAccount ac = new CheckingAccount();
            ac.balance = recentBalance;
            ac.processCheck("233");
            System.err.println(ac.balance);
        } else if ("B".equalsIgnoreCase(s)) {
            System.out.println("Savings Account");
            System.out.println("Enter Months For Interest");
            SavingsAccount sa = new SavingsAccount();
            sa.balance = recentBalance;
            sa.depositMonthlyInterest();
            System.out.println(sa.balance);
            

        } //

    }
}