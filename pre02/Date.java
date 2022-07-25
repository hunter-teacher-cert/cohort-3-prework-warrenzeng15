import java.io.*;
import java.util.*;

public class Date {
  public static void main(String[] args){
    String day = "Monday";
    int date = 25;
    String month = "July";
    int year = 2022;
      System.out.print("American format:\n"+day+", "+month+", "+date+" "+year+"\n");
      System.out.println("European format:\n"+day+" "+date+" "+month+" "+year);
  }
}