package WO1;

import mytools.StdInput;

import java.util.ArrayList;

public class WO1_Aufgabe1 {
    public static void main(String[] args) {
        ArrayList<String> purchases = new ArrayList<>();
        System.out.println("Welcome to the programm!");

        boolean check = true;
        double balance = 0;

        while (check) {
            System.out.print("Please enter the amount, 0 (zero) to purchase:");
            double amount = StdInput.readDouble();

            if (amount == 0) {
                check = false;
                break;
            }

            System.out.println("To deposit, press +, to withdraw, press -, to show balance, press =");
            char action = StdInput.readChar();

            if (action == '+') {
                balance = deposit(amount, balance);
                purchases = updatePurchases(purchases, amount, action);
            } else if (action == '-') {
                balance = withdraw(amount, balance);
                purchases = updatePurchases(purchases, amount, action);
            } else if (action == '=') {
                getBalance(balance);
            } else {
                System.out.println("Wrong input!");
            }
        }

        System.out.println("Your purchases: ");
        for (int i = 0; i < purchases.size(); i++) {
            System.out.println(purchases.get(i));
        }

        System.out.println("Final balance: " + balance);
    }

    public static double deposit(double amount, double balance) {
        return balance + amount;
    }

    public static double withdraw(double amount, double balance) {
        return balance - amount;
    }

    public static void getBalance(double balance) {
        System.out.println("Your current balance is: " + balance);
    }

    public static ArrayList<String> updatePurchases(ArrayList<String> purchases, double amount, char action) {
        String stringamount = Double.toString(amount);
        String stringaction = Character.toString(action);
        String output = stringaction + stringamount;
        purchases.add(output);
        return purchases;
    }
}