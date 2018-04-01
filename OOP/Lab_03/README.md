# LAB03
## This is 03 lab work in Java OOP "MatrixPrint on Java"
In this work I write a MatrixPrint method on Java lang and test it with Prometheus.
Code stored in file: MatrixPrint.java

### First step: Write a simple algorithm for draw matrix witx * on the diagonals:
```java
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
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_03/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
