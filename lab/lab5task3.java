/*3.Write a program that has the following static variable - balance (initial value 0)
    and these static methods:

deposit(double amount): Increase account balance

withdraw(double amount): Decrease account balance

Now run an infinite loop in main program so it displays user with following options:

1.	Deposit

2.	Withdraw

3.	Balance

4.	Exit

Under each option, the program should ask for appropriate user input (i.e. amount to deposit).
*/

package labmannualsol;
import java.util.Scanner;

public class lab5task3 {
    static double balance=0;
    static double deposit(double b){
        return balance+=b;
    }
    static double withdraw(double d){
        return balance-=d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = 0;
        int b;
        System.out.println("Enter what you want: ");
        boolean a = true;
        while(a){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            b = in.nextInt();
            if(b == 1){
                System.out.println("Enter amount to deposit: ");
                amount = in.nextDouble();
                deposit(amount);
                System.out.println("Successful");
            }
            else if(b == 2){
                System.out.println("Enter amount to withdraw: ");
                amount = in.nextDouble();
                if(balance>=amount) {
                    withdraw(amount);
                    System.out.println("Successful");
                }
                else System.out.println("You don't have that much of cash");
            }
            else if(b == 3){
                System.out.println("Balance: "+balance);
            }
            else if(b == 4){
                break;
            }
        }
    }
}
