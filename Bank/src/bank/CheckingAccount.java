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
class CheckingAccount extends BankAccount{
    double insufficientFundsFee;
  
  double processCheck( String checkToProcess ){
    double amount = Double.parseDouble(checkToProcess);
    this.balance+=amount;
    return this.balance;
    
  }
  
  @Override
  double withdrawal(double amount){
    this.balance-=amount;
    return this.balance;
  }
}