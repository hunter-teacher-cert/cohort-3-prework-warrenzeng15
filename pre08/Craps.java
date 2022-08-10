import java.util.Random;
import java.util.Scanner;

public class Craps {

//returns a random number between 1 and that number, inclusive
public static int roll(int num) {
  Random rand = new Random();
  int diceRoll = (int) rand.nextInt(num);
  return diceRoll+1;
}

//two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice
public static int shoot(int dice, int maxVal) {
int diceValue = 0;
for (int i = 0; i < dice; i++ ) {
  diceValue += roll(maxVal);
}  
return diceValue;
}
  
//return something to indicate if the shooter of the round wins or loses.
public static String round () {
int diceValue = shoot(2,6);
System.out.println("You rolled: " + diceValue);
if (diceValue == 2 || diceValue == 3 || diceValue == 12) {  
  System.out.println("That's craps!");
  return "lose";
}
else if ( diceValue == 7 || diceValue == 11){
  System.out.println("That's a natural!");
  return "win";
}
else{
System.out.println("The point is now: " + diceValue);
  int point = diceValue;
    do {
          diceValue = shoot(2,6);
          System.out.println("You rolled: " + diceValue);
          if(diceValue == point){
          System.out.println( "Nice, you rolled the point.");
          return "win";
          } else if(diceValue == 7){
          System.out.println("Uh oh, you rolled a 7.");
          return "lose";
       } 
     } while(diceValue != 7 || diceValue != point);
        }
        return "";
    }


public static void main(String[] args) {
System.out.println("How many rounds would you like to play?");
        Scanner in = new Scanner(System.in);
        int rounds = in.nextInt();
        System.out.println("");

        for(int i = 0; i < rounds; i++){
            System.out.println("ROUND " + (i+1));
            System.out.println("You " + round() + "!\n");
        }

    }

}