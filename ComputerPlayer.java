/**
 * This class represents a computer
 * player in the Odd-Even game
 * author: Joyce Jiang jj3115
 * February 26, 2021
 *  
 */

public class ComputerPlayer{
    private double t;
    private int tokenBalance; ///computer score
    private int compChoice;
     
    public ComputerPlayer(){
         t=0.5; 
    }
     
    public ComputerPlayer(double threshold){
        t=threshold;
        tokenBalance=0;
        compChoice=0;
    }
    
   public void declare(){
        double randomN = (Math.random());
        if (randomN>=t){
             compChoice = 2;
        }else{
             compChoice = 1;
        }
   }
     
   public int getChoice(){
        return compChoice;
   }
    
     
  //altering scores
   public void adjustAdd(int n){
        tokenBalance=tokenBalance+n;
   }
  
   public void adjustSubtract(int n){
        tokenBalance=tokenBalance-n;
   }
     
   public int Score(){
        return tokenBalance;
   }
     
    
}
