/**
 * This class represents the Odd-Even game
 * author: Joyce Jiang jj3115
 * February 26, 2021
 */

import java.util.Scanner;

public class Game{
    //instance variables here:
    private Scanner input;
    private int humanChoice;
    private int Sum;
    private ComputerPlayer comp;
    private int replay;
    //for part 2
    private ComputerPlayer p1;
    private ComputerPlayer p2;

/* this version of the game constructor is for Part 1 (human and computer)
 * it takes no parameters */
    public Game(){
        Sum=0;
        comp=new ComputerPlayer();
        input=new Scanner(System.in);
    }
    
/* this version of the game constructor is for Part 2
 * It requires two doubles as parameters. You will use 
 * these to set the initial thresholds for you computer players */
    public Game (double t1, double t2){
        p1=new ComputerPlayer(t1);
        p2=new ComputerPlayer(t2);
    }
    
/* this version of the play method is for Part 1
 * It takes no parameters and should play one interactive
 * version of the game */
    public void play(){
        replay=1;
        System.out.println("~Welcome to a game of Odd Even!~");
        while(replay==1){
             //play
             System.out.println("Hello P1! Please declare 1 or 2: ");
             humanChoice = input.nextInt();
             System.out.println("Your choice: " + humanChoice);
             comp.declare(); //computer move //using threshold random.random (instance variable as a threshold 0-1) .//p2choice = some method call for computer player
             //sum
             Sum=comp.getChoice()+humanChoice;
             System.out.println("The sum is: " +Sum);
             //compare
             compareHuman(Sum);
             System.out.println("Computer score: " +comp.Score());
             //again?
             Scanner input = new Scanner (System.in);
             System.out.println("Would you like to play again? 0-no OR 1-yes!");
                  replay=input.nextInt();
        } //end while statement
        System.out.println("Thanks for playing!");
    }

/** this version of the play method is for Part 2
 * computer vs compter
 * It takes a single int as a parameter which is the
 * number of computer vs. computer games that should be played */
    public void play(int games){
         for (int i=0; i<games; i++){
              int pt2Sum=p1.getChoice()+p2.getChoice();
              compareComp(pt2Sum);
         }
    }
   
    //change token balance of computer p2 and not have a human instance variable
    //
    private void compareHuman(int sum){
        if(sum%2==0){ //even: p2 wins
             comp.adjustAdd(sum);
             comp.Score();
             System.out.println("You lost " +sum+ " tokens!");
        }else{ //odd: p1 wins
             comp.adjustSubtract(sum);
             comp.Score();
             System.out.println("You gained " +sum+ " tokens!");
        }
    }
     
    private void compareComp(int sum){
        if(sum%2==0){ //even: p2 wins
             p2.adjustAdd(sum);
             p1.adjustSubtract(sum);
        }else{ //odd: p1 wins
             p2.adjustSubtract(sum);
             p1.adjustAdd(sum);
        }
    }
    
/* this method should return the current score (number of tokens)
 * that player 1 has */
    public int getP1Score(){
         return p1.Score();
    }
    
/* this method should return the current score (number of tokens)
 * that player 2 has */
    public int getP2Score(){
         return p2.Score();
    }  
 
    
}
