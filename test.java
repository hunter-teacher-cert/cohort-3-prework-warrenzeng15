import java.util.Scanner;

public class test {
  
public static void nLines(int n) {
    if (n > 0) {
        System.out.println(1);
        nLines(n - 1);
    }
}
public static void zoop(String fred, int bob) {
    System.out.println(fred);
    if (bob == 5) {
        ping("not ");
    } else {
        System.out.println("!");
    }
}

public static void main(String[] args) {
    int bizz = 5;
    int buzz = 2;
    nLines(4);
    //zoop("just for", bizz);
    //clink(2 * buzz);
}
public static void clink(int fork) {
    System.out.print("It's ");
    zoop("breakfast ", fork);
}

public static void ping(String strangStrung) {
    System.out.println("any " + strangStrung + "more ");
}
}

    //countup(userguess);
  
    //public static void countup(int n) {
    //if (n == 0) {
    //    System.out.println("Blastoff!");
    //} else {
    //    countup(n - 1);
    //    System.out.println(n);
