# DiceGame
#Mohamad Fahmi bin Mohamad Shuhari <br>
#Programming Test 
Your company would like to develop a dice game. The game rules are as below: 
1.	The game contains 4 players.
2.	Each player will have 6 dice in their dice cup.
3.	Each round all players will roll their dice at the same time.
4.	All dice with number 1 on top side will be passed to player on his right hand (the right most player will pass the dice to left most player)
5.	All dice with number 6 on top side will be removed from their dice cup.
6.	All players roll their dice again to start next round.
7.	The player who first emptied their dice cup (could be more than 1 player) is  the winner(s).  
You are required to write a program to simulate this game and print out the result of each round until l winner(s) is found. 
Example of output: 

Round 1 
After dice rolled:<br>
Player A: 3,4,5,6,1,1 <br>
Player B: 5,4,5,4,3,1 <br>
Player C: 6,6,6,3,2,4 <br>
Player D: 5,1,3,2,4,1 <br>

After dice moved/removed: <br>
Player A: 3,4,5,1,1 <br>
Player B: 5,4,5,4,3,1,1 <br>
Player C: 3,2,4,1 <br>
Player D: 5,3,2,4 <br>

Round 2: <br>
After dice rolled: <br>
Player A: 2,3,6,2,6 <br>
Player B: 6,6,6,4,1,3 <br>
Player C: 3,2,1,6 <br>
Player D: 6,6,1,2 <br>

After dice moved/removed: <br>
Player A: 2,3,2,1 <br>
Player B: 4, 1, 3 <br>
Player C: 3, 2, 1 <br>
Player D: 2, 1 <br />
(Repeat until winner(s) is found) 

<h3>Sample Output</h3>
<kbd>
<img src="https://github.com/fahmyamy/DiceGame/blob/master/output.png" />
</kbd>
