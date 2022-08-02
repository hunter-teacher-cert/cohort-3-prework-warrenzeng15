import java.io.*;
import java.util.*;

public class Beer {

  public static void numbeer(int n) {
    if (n > 0) {
      int nextNum = n-1;
        System.out.println(n + " bottles of beer on the wall,\n" + n + " bottles of beer, \nya' take one down, ya' pass it around,\n" + nextNum + " bottles of beer on the wall. \n");
        numbeer(n - 1);
    }
  }
  
    public static void finalverse() {
        System.out.println("No bottles of beer on the wall,\n" + "no bottles of beer,\n" + "ya' can't take one down, ya' can't pass it around,\n" + "'cause there are no more bottles of beer on the wall!");
  }

  public static void main (String[] args) {
    numbeer(99);
    finalverse();
}
  }


