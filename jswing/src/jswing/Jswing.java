/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jswing;
import javax.swing.*;
/**
 *
 * @author MICOLE
 */
public class Jswing {

    /**
    * @param args the command line arguments
     */
  public static void main(String args[])
  {
    String str1 = JOptionPane.showInputDialog("What is your name?");
    String str2 = JOptionPane.showInputDialog("What is your age");
                                   // input dialog returns always a string
   
 System.out.println(str1 +str2);
  }
    
}
