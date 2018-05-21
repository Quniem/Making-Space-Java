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

abstract class BankAccount {

      String owner;
      double balance;

     double deposit(double amount) {
        this.balance += amount; 
        return this.balance;
//        int amount = input;
//
//        System.out.println(minus + RecentBalance);
    }

    abstract double withdrawal(double amount);
}
