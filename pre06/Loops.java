
public class Loops {

  //excercise 2
  public static double squareRoot (double a) {
    double guess = a/ 2;
    double newGuess = ((guess + (a/guess))/2);
      while(Math.abs(guess - newGuess) >= 0.0001) {
        guess = newGuess;
        newGuess = ((guess + (a/guess))/2);
      }
    return newGuess;
      }
    
  
  

  //excercise 3
  public static void power {
    
  }
  
  
  //excercise 4
  public static int factorial {
    
  }

  public static void main(String[] args) {
    System.out.println(squareRoot(9));
 
  }
}
