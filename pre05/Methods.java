import java.io.*;
import java.util.*;

public class Methods {

  public static boolean isDivisible(int n, int m) {
    return (n % m == 0);
  }

  public static boolean isTriangle(int x, int y, int z) {
    return (!(x > y + z) && !(y > x + z) && !(z > x + y));
  }

  public static int ack(int x, int y) {
    return;
  }



  
  public static void main(String[] args) {
    System.out.println(isDivisible(10, 2));
    System.out.println(isTriangle(3, 4, 5));

  }
}
