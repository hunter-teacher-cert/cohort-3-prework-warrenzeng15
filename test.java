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
    loop(100);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
}
  }

