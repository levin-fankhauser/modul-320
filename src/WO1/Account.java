package WO1;

import java.util.ArrayList;

public class Account {

    private double balance;

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> updatePurchases(ArrayList<String> purchases, double amount, char action) {
        purchases.add(Character.toString(action) + Double.toString(amount));
        return purchases;
    }
}
