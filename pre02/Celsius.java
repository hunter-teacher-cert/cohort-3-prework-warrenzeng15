import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        double celsius;
        double farenheit;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a temperature in celsius: ");
        celsius = in.nextDouble();
        farenheit = celsius * 1.8 + 32;
        System.out.printf("%.1f C = %.1f F\n", celsius,farenheit);
    }
}