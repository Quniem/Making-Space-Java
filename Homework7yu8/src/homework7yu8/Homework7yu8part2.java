/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7yu8;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author MICOLE
 */
public class Homework7yu8part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
String Sentence;
    FileReader in = new FileReader("file.txt");
        BufferedReader ba = new BufferedReader(in);
      
        while (( Sentence = ba.readLine()) !=  null){
           
        System.out.println(Sentence);
    }
        in.close();
        
       

    }
    
}
