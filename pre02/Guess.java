import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {
    //pick a random number
    Random random = new Random();
    int number = random.nextInt(100)+1;
    //scanner for prompting user
    Scanner in = new Scanner(System.in);
    int userguess;

    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess         what it is?");
    
    //user prompt
    System.out.print("Type a number: ");
    userguess = in.nextInt();
    System.out.println("Your guess is: " + userguess);
    System.out.println("The number I was thinking of is: " + number);
    int difference = number - userguess;
    System.out.println("You were off by: "+ difference);
    //haven't figured out absolue value yet but the program is functional
  }
}