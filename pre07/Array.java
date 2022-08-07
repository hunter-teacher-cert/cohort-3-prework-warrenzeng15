import java.util.Arrays;
import java.util.Random;


public class Array {

  public static void powArray(double[] values, double b) {
    for (int i = 0; i < values.length; i++) {
      values[i] = Math.pow(values[i], b);
    }
  }

	public static int[] randomArray(int size){
		Random random = new Random();
		int[]a = new int[size];
		for (int i=0; i <a.length; i++) {
			a[i]=random.nextInt(100);
		}
			return a;
		}

  
  public static int[] histogram(int[] scores, int counters) {
    int[] counts = new int[counters];
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
    System.out.println(Arrays.toString(values));
    System.out.println();
    //create an array with 100 test scores, randomized from 1-99
    int[] testScores = randomArray(100);
    System.out.println(Arrays.toString(histogram(testScores,100)));
  }
}