
package banking.system.oop;

import java.util.Scanner;

/**
 * The main class allows users to manage a bank account by performing transactions: depositing, withdrawing, and sending money
 * It interacts with the Account class to execute these operations and continuously prompts the user for actions until they choose to exit
 * 
 * @author szvidzwa
 * @version 1.0.0
 */
public class BankingSystem {

/** Creates an account object and displaysOptions from Account class 
 * 
 * @param args takes in String argument of input from displayOptions listed
 */
    public static void main(String[] args) {
       Account account = new Account(); 
        System.out.println("Welcome to our private Online Banking System");

        Scanner input = new Scanner(System.in);
        account.displayOptions();
        
        /** While loop to execute based from answers given
         * Continues to loop until user selects option d
         */
        while (!account.getAnswer().equalsIgnoreCase("d")) {
            switch (account.getAnswer().toLowerCase()) {
                case "a":
                    System.out.print("How much do you want to deposit?\n$");
                    double deposit = input.nextDouble();
                    account.deposit(deposit);
                    break;
                case "b":
                    System.out.print("How much do you want to withdraw?\n$");
                    double withdraw = input.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case "c":
                    System.out.print("How much do you want to send?\n$");
                    double send = input.nextDouble();
                    account.send(send);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
            
            /** Call the Methods from Account class
             * Displays the balance and transaction options
             * 
             */
            account.displayBalance();
            account.displayOptions();
        }
      
        System.out.println("Thank you for using our online banking program. Goodbye!");
    } 
    
} 
    
    

