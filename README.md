# Poker Game
Java Programming Project creating a poker game.


/** 
 * Programming Project 3
 * @author: Joyce Jiang
 * uni: jj3115
 * Date: February 28, 2021
 */

* Part 1 required students to write a program for a game of Odd Even with human vs computer. Instance variables for this part includes humanChoice to represent the input (1 or 2), Sum to represent the sum of the computer choice of 1/2 and human input, and replay to represent if the human wishes to play multiple rounds. 

Initializing the variable replay to 1 allows for the game to play its round. I started off with a Scanner for the human to input their choice of 1 or 2, and used that variable to print out whether or not they lost or gained *however many tokens* based on their input. I then call the declare method in ComputerPlayer.java for the program to run a round of the computer deciding whether their choice is 1 or 2. In the declare() method, I had originally initialized the threshold to be 0.5. I then called a random number from 0 to 0.99- as a double, and used if statements on what the computer choice was going to be.

Using an accessor method getChoice(), I returned the computer choice of 1 or 2 and used that variable in determining the sum. Using the sum as a parameter for the compareHuman mutator method, I used if statements to determine if the sum was even or odd, and adjusted the scores accordingly based on the rules of Odd Even. 

*Part 2 describes the game of Odd Even in which there are two computer players. In this version, number of the threshold and the number of games are used as a parameter when calling the game. A for loop is used to go through each round for the number of games requested. A similar mutator method compareComp takes in the sum and adjusts the scores accordingly. In addition, the Simulation class is written with the goal to determine whether or not a player had an advantage to the game. 

I decided to write nested for loops in order to go through each loop based on an interval of 0.02. The variable p1MinScore was initialized to 400,000 as recommended by a TA (Annie) because as one player wins 400K tokens, the other loses. The second (nested) for loop goes through the game also in intervals of 0.02. After the game g method is called, the if statements compare the scores to the minimum score, and adjusts that to p1MinScore if necessary. Similar to line 33, if its compared and is larger than the MaxMin score, it is adjusted and the ideal threshold is adjusted. 

The final if statements decide which Player had an advantage to the game based on what MaxMin was adjusted to of Player 1 (since Player 2 would just be the opposite).
