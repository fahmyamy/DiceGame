import java.util.*;

public class DiceGame
{
   public static void main(String[] args)
   {
      System.out.println("*********Dice Game!!**********");
      System.out.println("______________________________");
      startGame();
   }
   
   static void startGame()
   {
      List<Integer> playerA = new ArrayList<>();
      List<Integer> playerB = new ArrayList<>();
      List<Integer> playerC = new ArrayList<>();
      List<Integer> playerD = new ArrayList<>();
      List<Integer> tempA;
      List<Integer> tempB;
      List<Integer> tempC;
      List<Integer> tempD;
      int startDiceA = 6, startDiceB = 6, startDiceC = 6, startDiceD = 6;
      int round = 1, next = 1;
      System.out.println("\nPress \"ENTER\" to roll dice...");
      Scanner scanner = new Scanner(System.in);
      scanner.nextLine();
      while(next == 1)
      {
         System.out.println("Round "+ round);
         System.out.println("After dice rolled:");
         System.out.print("Player A: ");
         rollDice(startDiceA, playerA);
         tempA = new ArrayList<>(playerA);
         printResult(playerA, tempA);
         
         System.out.print("\n");
         System.out.print("Player B: ");
         rollDice(startDiceB, playerB);
         tempB = new ArrayList<>(playerB);
         printResult(playerB, tempB);
         
         System.out.print("\n");
         System.out.print("Player C: ");
         rollDice(startDiceC, playerC);
         tempC = new ArrayList<>(playerC);
         printResult(playerC, tempC);
   
         System.out.print("\n");
         System.out.print("Player D: ");
         rollDice(startDiceD, playerD);
         tempD = new ArrayList<>(playerD);
         printResult(playerD, tempD);
        
         System.out.println("\n\nAfter dice moved/removed:");
         changesProcess(playerA, playerB, tempA, tempB);
         changesProcess(playerB, playerC, tempB, tempC);
         changesProcess(playerC, playerD, tempC, tempD);
         changesProcess(playerD, playerA, tempD, tempA);
         
         System.out.print("Player A: ");
         printResult(playerA, tempA);
         
         System.out.print("\n");
         System.out.print("Player B: ");
         printResult(playerB, tempB);
   
         System.out.print("\n");
         System.out.print("Player C: ");
         printResult(playerC, tempC);
         
         System.out.print("\n");      
         System.out.print("Player D: ");
         printResult(playerD, tempD);
       
         startDiceA = checkSize(playerA,tempA);
         startDiceB = checkSize(playerB,tempB);
         startDiceC = checkSize(playerC,tempC);
         startDiceD = checkSize(playerD,tempD);
         round++;
         
         if (startDiceA == 0)
         {
            System.out.println("\nPLAYER A WIN!!");
            next = 0;
         }
         if (startDiceB == 0)
         {
            System.out.println("\nPLAYER B WIN!!");
            next = 0;
         }
         if (startDiceC == 0)
         {
            System.out.println("\nPLAYER C WIN!!");
            next = 0;
         }
         if (startDiceD == 0)
         {
            System.out.println("\nPLAYER D WIN!!");
            next = 0;
         }
         
          if (next != 0)
          {
             System.out.println("\n");
             System.out.println("Press \"ENTER\" to roll dice for next round...");
             scanner.nextLine();
          }else {
             System.exit(0);
          }
      }
   }
   
   static void rollDice(int totalDice, List<Integer> playerDice)
   {
      playerDice.clear();
      Random random = new Random();
      for(int i = 0; i < totalDice; i++)
      {
         playerDice.add(random.nextInt(totalDice)+1);
      }
   }
   
   static int checkSize(List<Integer> playerDice, List<Integer> tempDice)
   {
      playerDice = new ArrayList<>(tempDice);
      return playerDice.size();
   }
   static void printResult(List<Integer> playerDice, List<Integer> tempDice)
   { 
      playerDice = new ArrayList<>(tempDice);
      Iterator<Integer> display = playerDice.iterator();
      while (display.hasNext())
      {
         int i = (int) display.next();
         System.out.print(i + ", ");
      }
   }
   
   static void changesProcess(List<Integer> playerDice, List<Integer> nextPlayer, List<Integer> tempPlayer, List<Integer> tempNextPlayer)
   { 

      for (int x = 0; x < playerDice.size(); x++)
      {
         if (playerDice.contains(6))
         {
            tempPlayer.remove(new Integer(6));
         }
      }
      
      Iterator<Integer> display = playerDice.iterator();
      while (display.hasNext())
      {
         int i = (int) display.next();
         if (i == 1)
         {
            tempPlayer.remove(new Integer(i));
            tempNextPlayer.add(new Integer(i));
         };
      }
   }
}