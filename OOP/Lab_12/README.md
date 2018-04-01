# LAB12
## This is 12 lab work in Java OOP " on Java"
In this work I write a  on Java lang and test it with Prometheus.
Code stored in file: .java

### First step:
```java
package com.tasks6.rle;

public class Application {
    public static void main(String[] args) {
        if (args != null && args.length == 1 && args[0] != null){
            StringBuilder result = new StringBuilder("");
            if (args[0].length() != 0) {
                int count = 1;
                char c = args[0].charAt(0);

                for (int i = 1; i < args[0].length(); i++) {
                    if (c == args[0].charAt(i)) {
                        if (count == 9) {
                            result.append(c).append(count);
                            count = 0;
                        }
                        count++;
                    } else {
                        if (count == 1) {
                            result.append(c);
                        } else {
                            result.append(c).append(count);
                        }
                        c = args[0].charAt(i);
                        count = 1;
                    }
                }
                if (count == 1){
                    result.append(c);
                } else result.append(c).append(count);
            }
            System.out.println(result);
        }
    }
}

```

### Second step:
```java
package com.tasks6.rle_decoder;

public class Application {
    public static void main(String[] args) {
        if (args != null && args.length == 1 && args[0] != null) {
            StringBuilder result = new StringBuilder("");
            if (args[0].length() != 0 && !Character.isDigit(args[0].charAt(0))) {
                char c = args[0].charAt(0);
                int count = 0;
                for (int i = 0; i < args[0].length() - 1; i++){
                    if ((Character.isDigit(args[0].charAt(i)) && Character.isDigit(args[0].charAt(i + 1)))
                            || (!Character.isDigit(args[0].charAt(i)) && !Character.isDigit(args[0].charAt(i + 1))
                            && c == args[0].charAt(i + 1))
                            || (i < args[0].length() - 2 && (!Character.isDigit(args[0].charAt(i)) && Character.isDigit(args[0].charAt(i + 1))
                            && !Character.isDigit(args[0].charAt(i + 2)) && args[0].charAt(i) == args[0].charAt(i + 2)
                            && Character.getNumericValue(args[0].charAt(i + 1)) != 9 ))) {
                        count = 1;
                        break;
                    }
                    if (!Character.isDigit(args[0].charAt(i)) && !Character.isDigit(args[0].charAt(i + 1))
                            && c != args[0].charAt(i + 1)) {
                        result.append(c);
                        c = args[0].charAt(i + 1);
                    }
                    if (Character.isDigit(args[0].charAt(i + 1))) {
                        int size = Character.getNumericValue(args[0].charAt(i + 1));
                        for (int j = 0; j < size; j++) {
                            result.append(c);
                        }
                    }else c = args[0].charAt(i + 1);
                }
                if (!Character.isDigit(args[0].charAt(args[0].length() - 1))) {
                    result.append(c);
                }
                if (count == 1){
                    result.replace(0, result.length(), "");
                }
            }
            System.out.println(result);
        }
    }
}
```

### Third step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_12/screen.png "Approved!"

![alt text][screen1]

[screen1]: https://github.com/skrix/University-works/blob/master/OOP/Lab_12/screen1.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
