import java.util.Arrays;
import java.util.Random;

public class Array {

  public static void powArray(double[] values, double b) {
    for (int i = 0; i < values.length; i++) {
      values[i] = Math.pow(values[i], b);
    }
  }

  	public static int[] scoresArray(int size){
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i  < a.length; i++) {
			a[i] = random.nextInt(size);
		}
			return a;
		}


  
  public static int[] histogram(int[] scores, int counter) {
    int[] counts = new int[counter];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }

  

  public static void main(String[] args) {
    double[] values;
    values = new double[4];
    values[0] = 2.0;
    values[1] = 3.0;
    values[2] = 4.0;
    values[3] = 5.0;

    powArray(values, 2.0);
    System.out.println();
    System.out.println(Arrays.toString(values));


  }
}