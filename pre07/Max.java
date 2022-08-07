public class Max {

  public static int indexOfMax(int[] a) {
    int index = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[index]) {
        index = i;
      }
    }
    return index;
  }

   
  public static void main(String[] args) {
    int[] values;
    values = new int[5];
    values[0] = 5;
    values[1] = 19;
    values[2] = 2;
    values[3] = 100;
    values[4] = 35;
    
    System.out.println(indexOfMax(values));

    
  }
}

//As the text states, the enhanced for loop is not helpful when you need to refer to
// the index of an array, which is precisely what we need to do here.
// You may be able to use the enhanced for loop to do the same task, but you would likely need
// to create an extra way to track the index number for each value in the array, which would be 
// redundant work.