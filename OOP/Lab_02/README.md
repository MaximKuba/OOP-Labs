# LAB02
## This is 02 lab work in Java OOP "Square Root on Java"
In this work I write a Square Root method on Java lang and test it with Prometheus.
Code stored in file: SquareRoot.java

### First step: Write a simple algorithm for find Square Root for function:
```java
    if(((a==0) & (b==0)) | ((a==0) & (b==0) & (c==0))) 
    {
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
    }
    else 
    {
      double d = b*b - 4*a*c;
      if(d == 0)
      {
        double x1 = (-b)/(2*a);
        double x2 = x1;
      }
      else if( d > 0) 
      {
        double x1 = (-b + Math.sqrt(d))/(2*a);
        double x2 = (-b - Math.sqrt(d))/(2*a);
      }
      else if ( d < 0)
      {
        return;
      }
    }
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_02/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
