public class test {

  public static void count(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      count(n - 1);
      System.out.println(n);
      
    }
  }

  public static void main(String[] args) {
    count(5);
  }
}
