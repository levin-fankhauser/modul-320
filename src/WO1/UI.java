package WO1;

import mytools.StdInput;

import java.util.ArrayList;

import static WO1.Account.*;

public class UI {
    public static void main(String[] args) {
            Account bankaccount = new Account();
            ArrayList<String> purchases = new ArrayList<>();

        System.out.println("Welcome to the program!");

        boolean check = false;

        while (!check) {
            System.out.print("Please enter the amount, 0 (zero) to purchase:");
            double amount = StdInput.readDouble();

            if (amount == 0) {
                check = true;
                break;
            }

            System.out.println("To deposit, press +, to withdraw, press -, to show balance, press =");
            char action = StdInput.readChar();

            if (action == '+') {
                bankaccount.deposit(amount);
                purchases = bankaccount.updatePurchases(purchases, amount, action);
            } else if (action == '-') {
                bankaccount.withdraw(amount);
                purchases = bankaccount.updatePurchases(purchases, amount, action);
            } else if (action == '=') {
                System.out.println(bankaccount.getBalance());
            } else {
                System.out.println("Wrong input!");
            }
        }

        System.out.println("\nYour purchases: ");
        for (int i = 0; i < purchases.size(); i++) {
            System.out.println(purchases.get(i));
        }

        System.out.println("\nYour final balance is: " + bankaccount.getBalance());
    }
}