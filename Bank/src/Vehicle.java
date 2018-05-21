/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MICOLE
 */
class Vehicle {
    Public String myBrand, my Model;
    
    
    Public Vehicle(){
        myBrand = "unknown";
        myModel = "unkown;";
        
    }
    public Vehicle(String brand,String model){
        setBrand(brand);
        setModel(model);
        
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
     myBrand = brand;
     
    }
    public String getModel(){
        return myModel;
        
    }
    
    public void setModel(String model){
        myModel = model;
    }
    
    public String toString(){
        return getBrand()+""+getModel();
        
    }
    
}
