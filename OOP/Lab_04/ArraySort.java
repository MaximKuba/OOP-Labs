public class ArraySort {

  public static void main(String[] args) {
    int[] array = {30, 2, 10, 4, 6};
    int length = array.length;

    //PUT YOUR CODE HERE
    int n = length;
    int tmp;
    for(int j = 0; j < n - 1; j++){
      for(int i = 0; i < n - 1; i++){
        if (array[i] > array[i + 1]) 
        { 
          tmp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = tmp;
        } 
      }
    }
    
    //PUT YOUR CODE HERE

    for (int i = 0; i < length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}