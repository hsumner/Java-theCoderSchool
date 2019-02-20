import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args) {
        int num;
        int guess;
        int guesses;
        boolean quit = false;
        
        String above = "You're too high! Try again.  Press Alt F4 or 0 if you want to quit.";
        String below = "You're too low!  Try again.  Press Alt F4 or 0 if you want to quit.";
        
        //Instructions
        System.out.println("This is guessing game.  You will guess a number from 1 to 100 (inclusive).  Good luck");
        
        num =(int) (Math.random() * 100 + 1);
        guesses = 0;
        
        boolean firstGuess = true;
        
        Scanner scanGuess = new Scanner(System.in);
        guess = scanGuess.nextInt();
        guesses = 1;
        
        while (guess != num && !quit) {
            if (guess == 0) {
                quit = true;
                break;
            }
            if (guess > num) {
                System.out.println(above);
            } else if (guess < num) {
                System.out.println(below);
            }
            
            guess = scanGuess.nextInt();
            guesses++;
          }
          
          if (guess == num) {
              System.out.println("You guessed it! The number was " + num + ".  You guessed the number in " + guesses + " guesses.");
            } else if (quit) {
                System.out.println("You quit now go play Adopt Me on Roblox.");
        
            }
    }
}
