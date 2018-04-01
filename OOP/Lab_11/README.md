# LAB11
## This is 11 lab work in Java OOP " on Java"
In this work I write a  on Java lang and test it with Prometheus.
Code stored in file: .java

### First step:
```java
package com.tasks5.command;

public class Application {
    public static void main(String[] args) {
        Command command;

        if (args == null || args.length == 0){
            command = new Echo("Error");
        } else if (args.length == 1 && args[0].equals("help")){
            command = new Help();
        } else if (args.length == 1 && args[0].equals("exit")){
            command = new Exit();
        } else if (args.length == 2 && args[0].equals("date") && args[1].equals("now")){
            command = new Date();
        } else if (args.length == 2 && args[0].equals("echo")){
            command = new Echo(args[1]);
        } else {
            command = new Echo("Error");
        }

        command.execute();
    }
}

package com.tasks5.command;

public class Exit implements Command{
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}

package com.tasks5.command;

public class Help implements Command{
    @Override
    public void execute() {
        System.out.println("Help executed");
    }
}


package com.tasks5.command;

public class Date implements Command{
    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}

package com.tasks5.command;

public class Echo implements Command {
    private String input = "";

    public Echo(String text){
        input = text;
    }
    @Override
    public void execute() {
        System.out.println(input);
    }
}

```
### Second step: Run the program test on Prometheus:

![alt text][screen]

[screen]: https://github.com/skrix/University-works/blob/master/OOP/Lab_11/screen.png "Approved!"

#### Console output: Правильно!

### Thanks for reading!
