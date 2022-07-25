import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args) {
    int hour = 17;
    int minute = 50;
    int second = 10;
    double secsmid = (hour * 60 * 60) + (minute * 60) + second;
    double secinday = 24 * 60 * 60;
    double secleft = secinday - secsmid;
    double percentofday = (secsmid / secinday) * 100.0;
    System.out.println("The number of seconds since midnight is: " + secsmid);
    System.out.println("The number of seconds remaining in the day is: " + secleft);
    System.out.println("The percentage of the day that has passed is: " + secsmid / secinday * 100);
    hour = 18;
    minute = 31;
    second = 12;
    double elapsedsecsmid = (hour * 60 * 60) + (minute * 60) + second;
    double elapsedtime = elapsedsecsmid - secsmid;
    System.out.println("The elapsed time since I began this excercise is: " + elapsedtime/60 + " minutes.");
  }
}