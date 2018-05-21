/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Skateboard;

/**
 *
 * @author MICOLE
 */
 class Skateboard extends Vehicle {
 
public double myBoardLength;

public Skateboard(){
    myBoardLength= 0;
}

public Skateboard(double boardLength){
setBoardLength(boardLength);

}

public double getBoardLength(){
return myBoardLength;
}

public void setBoardLength(double boardLength){
myBoardLength = boardLength;
}
}