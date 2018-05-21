/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author MICOLE
 */
class SavingsAccount extends BankAccount {

    double percentage;

    void depositMonthlyInterest() {
        this.balance= (this.balance*(percentage/100))+this.balance;
    }

    
    double withdrawal(double amount) {
       this.balance-=amount;
       return this.balance;
    }
}
