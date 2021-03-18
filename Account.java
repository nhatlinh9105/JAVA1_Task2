package Task2;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible;
        String cusName;

        System.out.printf("Available account balance is: %.2f", accountBalance);
        System.out.println("Enter the Amount to withdraw: $" );
        Scanner scan = new Scanner(System.in);
        
        withdraw = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the custom name: ");
        cusName = scan.nextLine();

        //Decision making whether  sufficient balance is present for transaction to proceed.
        possible = (accountBalance > withdraw);
        accountBalance = possible ?  accountBalance - withdraw : accountBalance;

        System.out.println("Welcome: " + cusName);
        System.out.printf("\nCurrent Account balance is: $%.2f", accountBalance);
        System.out.printf("\nTransaction Successful: ", possible);

    }
    
}
