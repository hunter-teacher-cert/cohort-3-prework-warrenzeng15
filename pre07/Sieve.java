import java.util.Arrays;

public class Sieve {

  public static boolean[] sieve(int n) {
    // create boolean array, set all elements to true
    boolean[] isPrime = new boolean[n];
    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i < n; i++) {
      isPrime[i] = true;
    }

    // check every number if prime number starting from 2
    for (int i = 2; i < Math.sqrt(n); i++) {

      // if element in array is true
      if (isPrime[i] = true) {

        // change multiples of the element to false
        for (int j = (i * i); j < n; j = j + i) {
          isPrime[j] = false;
        }
      }
    }

    return isPrime;
  }

  public static void main(String[] args) {

    System.out.println(Arrays.toString(sieve(30)));

  }
  //i have a bug where the index for the number 4 appears as true when it should be false
  //the boolean values for everything else seems to be correct
}