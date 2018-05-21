/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicycle;

/**
 *
 * @author MICOLE
 */
class Bicycle extends Vehicle {
    public int myGearCount;
    
    public Bicycle(){
        myGearCount = 1;
    }
    public Bicycle(int gearCount){
        setGearCount(gearCount);
    }
    public int getGearCount(){
        return myGearCount;
        
    }
    
    public void setGearCount(int gearCount){
        myGearCount = gearCount;
    }
}
