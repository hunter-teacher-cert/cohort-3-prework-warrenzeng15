
public class Loops {

  // excercise 2
  public static double squareRoot(double a) {
    double guess = a / 2;
    double newGuess = ((guess + (a / guess)) / 2);
    while (Math.abs(guess - newGuess) >= 0.0001) {
      guess = newGuess;
      newGuess = ((guess + (a / guess)) / 2);
    }
    return newGuess;
  }

  // excercise 3
  public static double power(double x, int n) {
    double powerOf = 1;
    for (int i = 0; i < n; i++) {
      powerOf = powerOf * x;
    }
    return powerOf;

  }

  // excercise 4
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(squareRoot(9));
    System.out.println(power(3, 3));
    System.out.println(factorial(5));
  }
}
