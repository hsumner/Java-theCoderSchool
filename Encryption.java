import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Type in a message to be encrypted:");
    String message = scanner.nextLine();
    
    System.out.println("Type in a value for the cipher key:");
    int key = scanner.nextInt();
    
    //System.out.println("Your original message: " + message);
    //System.out.println("Your key: " + key);
    
    String newMessage = "";
    for (int  i = 0; i < message.length(); i++) {
        String letter = message.substring(i, i + 1) ;
        int oldPosition = alphabet.indexOf(letter);
        int newPosition = (i + key) % alphabet.length();
        char newLetter = alphabet.charAt(newPosition);
        newMessage += newLetter;
        
        }
        System.out.println("Your message was " + message);
        System.out.println("Your encrypted message is " + newMessage);
    }
}
    


