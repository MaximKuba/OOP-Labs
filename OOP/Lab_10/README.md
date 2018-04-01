# LAB10
## This is 10 lab work in Java OOP "Sort with Comparator on Java"
In this work I write a  Sort with Comparator on Java lang and test it with Prometheus.
Code stored in file: Sort.java

### First step:
```java
public class Sort {
    private static void sort(int[] array, Comparator comp) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int val = array[i];
                int j;
                for (j = i; j >= gap && comp.compare(array[j - gap], val) > 0; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = val;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,5,2,4,10,6,0,3,10};
        Comparator comp = new Comparator();

        sort(array, comp);
        int[] arrayInv = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            arrayInv[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++){
            array[i] = arrayInv[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_10/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
