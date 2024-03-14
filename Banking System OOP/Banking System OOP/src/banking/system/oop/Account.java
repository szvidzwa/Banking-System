
package banking.system.oop;

import java.util.Scanner;

/**
 * The Account class encapsulates the process and data related to a user's bank account, including transactions of deposits, withdrawals, and sending money, and displaying the account balance
 * It makes use of private attributes, public methods, and modularity
 * 
 * @author szvidzwa
 * @version 1.0.0
 */
public class Account {
    
    private double checking; 
    private String answer; 

    /**
     * Default constructor: sets both the checking and answer variables to empty string
     */
    public Account() {
        checking = 0; 
        answer = ""; 
    }

    /** Method to display options and capture user input
     * 
     */
    public void displayOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat would you like to do:");
        System.out.println("a. Deposit funds into the account");
        System.out.println("b. Withdraw funds from the account");
        System.out.println("c. Send money to someone/Pay bill");
        System.out.println("d. Exit");
        answer = input.nextLine();
    }

    /** Accessor method to get the answer
     * 
     * @return the chosen answer option 
     */
    public String getAnswer() {
        return answer;
    }

    /** Method to process deposit
     * 
     * @param amount the funds to be added to checking
     */
    public void deposit(double amount) {
        checking += amount;
        System.out.println("You have successfully deposited $" + amount);
    }

    /** Method to process withdrawal
     * 
     * @param amount the funds to be subtracted from checking
     */
    public void withdraw(double amount) {
        if(amount <= checking) {
            checking -= amount;
            System.out.println("You have withdrawn $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    
    /**Method to process send
     * 
     * @param amount the funds to be subtracted from checking
     */
    public void send(double amount) {
        if (amount <= checking) {
            System.out.println("Type in Full Name of person/Merchant you want to send money to: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            checking -= amount;
            System.out.println("You have sent $" + amount + " to " + name);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /** Method to show the current balance
     * 
     */
    public void displayBalance() {
        System.out.println("Your current balance is $" + checking);
    }

}
 
