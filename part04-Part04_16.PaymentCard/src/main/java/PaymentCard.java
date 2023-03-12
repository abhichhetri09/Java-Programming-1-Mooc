/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhic
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance = balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance = balance - 4.60;
        }
    }

    public void addMoney(double amount) {
        if (balance + amount >= 150) {
            this.balance = 150;
        } else {
            if (amount < 0) {
                this.balance = balance;
            } else {
                this.balance += amount;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
