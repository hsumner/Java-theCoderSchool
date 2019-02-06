
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
     public static void main(String[] args) {
         int player;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Rock (r), Paper (p), or Scissors (s)?");
         
         String playerAnswer = scan.nextLine();
         
         
         if (playerAnswer.equals("r")) {
             player = 1;
             System.out.println("You chose rock.");
         } else if (playerAnswer.equals("s")) {
             player = 2;
             System.out.println("You chose scissors.");
         } else if (playerAnswer.equals("p")) {
             player = 3;
             System.out.println("You chose paper.");
         } else {
             System.out.println("Please type in a valid answer.");
         }
         
         Random rand = new Random();
         int computer = rand.nextInt(3) + 1;
         
         if (computer == 1) {
             System.out.println("The computer chose rock.");
         } else if (computer == 2) {
             System.out.println("The computer chose scissors.");
         } else if (computer == 3) {
             System.out.println("The computer chose paper.");
         }
     }
}
