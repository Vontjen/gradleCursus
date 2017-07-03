package com.realdolmen.greeting;

/**
 * Created by vdabcursist on 03/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        HelloService hs = new HelloService();
        System.out.println(hs.sayHello(args[0] + args[1]));
    }
}
