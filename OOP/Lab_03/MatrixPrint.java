public class MatrixPrint {
  public static void main(String args[]){
    //PUT YOUR CODE HERE
    int size = 5;
    int counter = 1;
    for(int i = 0; i < size; i++)
    {
      for(int j = 0; j < size; j++)
      {
        String printed;
        if( (i == j) || (i == size - j - 1))
        {
          printed = " * ";
        }
        else
        {
          printed = String.format("%2s ",counter);
        }
        System.out.print(printed);
        counter++;
      }
      System.out.println("");
    }
    //PUT YOUR CODE HERE
  }
}