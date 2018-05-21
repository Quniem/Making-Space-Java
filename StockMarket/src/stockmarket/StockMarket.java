/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockmarket;
//C:\Users\MICOLE\Downloads\NYSE.txt
//import java.lang.Object;
//import java.io.Reader;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.io.FileNotFoundException;
//import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author MICOLE
 */
// recall that the thins in the file is "symbol" , & Describtion so you can do class??Stocknames(String Symbol, String Describtion).
public class StockMarket {
    private static Formatter output;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        openFile();
        addRecords();
        closeFile();
    }
    
    public static void openFile(){
        try{
            output  =   new Formatter("NYSE.txt");
            
        }
        catch(SecurityException sequrityException){
            System.err.println("Write denied.Terminating");
            System.exit(1);
        }
        catch(FileNotFoundException fileFoundEception){
            System.err.println("Error Opening File,Bye");
        System.exit(1);
        }
    }
         
    public static void addRecords(){
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n?", 
                    "ENTER ABREVIATION, FULL NAME");
            
        
        
        while(input.hasNext()){
            try{
                output.format("%s %s %n", input.next(),input.next());
            }
            catch(FormatterClosedException formatterClosedException){
                System.err.println("Error in File,Bye");
                break;
            }
            catch(NoSuchElementException elementException){
                System.err.println("Invalid, try again");
                input.nextLine();
            }
            System.out.print("?");
        
        }
            
            
            public static void closeFile(){
                if(output!=null)
                    output.close();
                
            }
            
            
            
        }
    
    
    
    

   
