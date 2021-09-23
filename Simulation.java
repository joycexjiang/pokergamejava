/**
 * This class should run simulations to determine
 * whether or not the Odd-Even game is fair and if
 * not who has the advantage and what is a strategy
 * that will realize that adavantage.
 * 
 * 
 */


public class Simulation{
    
    public static void main(String[] args){
         //instance variables
         double idealT1 =0.0;
         double idealT2 =0.0;
         double p1MaxMin = -400000; //one player wins 400k tokens, one loses
         double p1MinScore = 400000;
         final int games = 100000;
         
        // thres p1
        //nested for loop
        //good interval is  0.02
        for(double T1=0.0; T1<=1.0; T1+= 0.02){
             p1MinScore=400000; 
             for(double T2=0.0; T2<=1.0; T2+=0.02){
                Game g = new Game(T1, T2);
                g.play(games);
                if (g.getP1Score()<p1MinScore){
                     p1MinScore=g.getP1Score();
                } //end if statement
             } //end second for loop  
             if (p1MinScore>p1MaxMin){
                  p1MaxMin = p1MinScore;
                  idealT1=T1;
             }
        } //end first for loop
        
        //comparison
        if (p1MaxMin>=0.0){
             System.out.println("Player 1 has an advantage to the game.");
        }else if(p1MaxMin<=0.0){
             System.out.println("Player 2 has an advantage to the game.");
        }

    } 
} //end class
