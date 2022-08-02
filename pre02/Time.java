import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args) {
    int hour = 17;
    int minute = 50;
    int second = 10;
    int secsmid = (hour * 60 * 60) + (minute * 60) + second;
    int secinday = 24 * 60 * 60;
    int secleft = secinday - secsmid;
    double percentofday = (double) secsmid / secinday;
    System.out.println("percent of day is:" + percentofday);
    System.out.println("The number of seconds since midnight is: " + secsmid);
    System.out.println("The number of seconds remaining in the day is: " + secleft);
    System.out.printf("The percentage of the day that has passed is: %.3f\n", percentofday * 100);
    hour = 18;
    minute = 31;
    second = 12;
    double elapsedsecsmid = (hour * 60 * 60) + (minute * 60) + second;
    double elapsedtime = elapsedsecsmid - secsmid;
    elapsedtime = elapsedtime / 60;
    System.out.printf("The elapsed time since I began this excercise is: %.2f minutes\n", elapsedtime);
  }
}