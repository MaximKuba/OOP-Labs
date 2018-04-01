# LAB09
## This is 09 lab work in Java OOP "Fibonacci on Java"
In this work I write a  Fibonacci on Java lang and test it with Prometheus.
Code stored in file: Fibonacci.java

### First step:
```java
public class Fibonacci
{
    long first = 1;
    long second = 1;
    long result;
    long iter = 2;

    public long getNumber(int position){
        if (position <= 30 && position > 0) {
            if (position == 1) {
                return first;
            } else if (position == 2) {
                return second;
            } else if (iter != position) {
                result = first + second;
                first = second;
                second = result;
                iter++;
                return getNumber(position);
            } else return result;
        } else return - 1;
    }
}
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_09/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
