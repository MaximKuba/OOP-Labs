public class SquareRoot {

  public static void main(String[] args) {
    double a = 3;
    double b = 2.5;
    double c = -0.5;

    //PUT YOUR CODE HERE
    if(((a==0) & (b==0)) | ((a==0) & (b==0) & (c==0))) 
    {
      System.out.println("x1="); 
      System.out.println("x2=");
      return;
    }
    else if((a==0) & (b!=0))
    {
      double x1;
      if (c==0)
        x1 = 0;
      else
        x1 = (-c)/(b);
      double x2 = x1;
      
      String t1 = String.format("x1=%s", x1); 
      String t2 = String.format("x2=%s", x2); 
      
      System.out.println(t1);
      System.out.println(t2);
    }
    else 
    {
      double d = b*b - 4*a*c;
      if(d == 0)
      {
        double x1 = (-b)/(2*a);
        double x2 = x1;
        
        String t1 = String.format("x1=%s", x1); 
        String t2 = String.format("x2=%s", x2); 
        
        System.out.println(t1);
        System.out.println(t2);
      }
      else if( d > 0) 
      {
        double x1 = (-b + Math.sqrt(d))/(2*a);
        double x2 = (-b - Math.sqrt(d))/(2*a);
        
        String t1 = String.format("x1=%s", x1); 
        String t2 = String.format("x2=%s", x2); 
        
        System.out.println(t1);
        System.out.println(t2);
      }
      else if ( d < 0)
      {
        System.out.println("x1="); 
        System.out.println("x2=");
        return;
      }
    }
        //PUT YOUR CODE HERE
  }
}