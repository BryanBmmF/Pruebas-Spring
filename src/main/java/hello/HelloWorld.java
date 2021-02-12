package hello;

import java.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {

        //Sin dependencias
        /*
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        * */

        //con dependencias
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

    }
}
