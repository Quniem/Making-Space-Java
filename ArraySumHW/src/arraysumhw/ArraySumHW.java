/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysumhw;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author MICOLE
 */
public class ArraySumHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] anArray;
        
        anArray = new int[6];
        anArray[1] = 22;
        anArray[2] = 30;
        anArray[3] = 107;
        anArray[4] = 60;
        anArray[5] = 29;
      System.out.println(((anArray[1]+anArray[2]+anArray[3]+anArray[4]+anArray[5]) )+":Is the sum");
      System.out.println(" max: "+anArray[1]+ " " +" min:"+anArray[3]);
      System.out.println("Random sum generator is next:");
      
        Scanner choice= new Scanner(System.in);
        System.out.println("Select a number for how many random numbers you would like:");
        int x= choice.nextInt();
        Random rand = new Random();
        int[] Numbers = new int[x];
         for (int i = 0; i< x; i++ ){
     
         int n = rand.nextInt(50) + 1;
            Numbers[i] = n;
            
    
    
      System.out.println(n+'\n');
     
    }
    int sum = 0;
    
    for(int i: Numbers){
    
      sum += i;
      
    }
    
    
     System.out.println(sum + "  is the sum"+'\n');
    
    // System.out.println("max is :"+ Numbers[20]);
     //System.out.println("Min is:" + Numbers[1]);
          
  
    
    
    }
    
}
