# LAB05
## This is 05 lab work in Java OOP "BinarySearch on Java"
In this work I write a Binary Search method on Java lang and test it with Prometheus.
Code stored in file: BinarySearch.java

### First step: Write a simple algorithm for BinarySearch in sorted array:
```java
    int low = 0; 
    int high = data.length - 1; 
    
    while (high >= low) { 
      int middle = (low + high) / 2;
      
      if (data[middle] == numberToFind) 
      {
        System.out.println(middle);
        return; 
      } 
      else if (data[middle] < numberToFind) 
      { 
        low = middle + 1; 
      } 
      else if (data[middle] > numberToFind) 
      { 
        high = middle - 1; 
      } 
    } 
    System.out.println(-1);
    return;
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_06/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
