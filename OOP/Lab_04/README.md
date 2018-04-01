# LAB04
## This is 04 lab work in Java OOP "Array Sort on Java"
In this work I write a Array Sort method on Java lang and test it with Prometheus.
Code stored in file: ArraySort.java

### First step: Write a algorithm for sorting an array:
```java
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
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_04/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
