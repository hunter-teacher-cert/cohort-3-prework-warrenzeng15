
public class Methods {

  public static boolean isDivisible(int n, int m) {
    return (n % m == 0);
  }

  public static boolean isTriangle(int x, int y, int z) {
    return (!(x > y + z) && !(y > x + z) && !(z > x + y));
  }

  //returns -1 if either parameter is a negative integer
  public static int ack(int m, int n) {
    if(m < 0 || n < 0){
      return -1;
    }
    
    if (m == 0) {
      return (n + 1);
    } else if (m > 0 && n == 0) {
      return (ack(m - 1, 1));
    } else if (m > 0 && n > 0){};
    
    return ack(m - 1, ack(m, n - 1));
   
  }

  public static void main(String[] args) {
    System.out.println(isDivisible(10, 2));
    System.out.println(isTriangle(3, 4, 5));
    System.out.println(ack(3, 2));
    System.out.println(ack(-3, 2));
  }
}
