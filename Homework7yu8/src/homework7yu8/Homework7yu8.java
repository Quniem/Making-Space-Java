//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7yu8;
import java.io.*;
import java.net.*;
/**
 *
 * @author MICOLE
 */
public class Homework7yu8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
 System.out.println("Here is the website bellow:");
        URL oracle  =   new URL("https://www.gaiaonline.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        String inputLine;
        while((inputLine    =   in.readLine())  !=  null)
           
        System.out.println(inputLine);
        in.close();
        
        System.out.println("Thats the end of the Website!");
// TODO code application logic here
    }
    
}