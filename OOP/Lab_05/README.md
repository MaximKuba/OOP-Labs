# LAB05
## This is 05 lab work in Java OOP "ShellSort on Java"
In this work I write a Shell Sort method on Java lang and test it with Prometheus.
Code stored in file: ShellSort.java

### First step: Write a algorithm for ShellSort:
```java
for (int d = length/2; d >= 1; d /= 2){
      for (int i = d; i < length; i++){
        for (int j = i; j >= d && array[j-d] > array[j]; j -= d){
          int tmp = array[j];
          array[j] = array[j-d];
          array[j-d] = tmp;
        }
      }
    }
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_05/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
