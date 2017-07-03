package com.realdolmen.greeting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vdabcursist on 03/07/2017.
 */
public class HelloServiceTest {

    @Test
    public void testSayHello(){

        HelloService helloService = new HelloService();
        String result = helloService.sayHello("tjen");
        assertEquals("Hello, tjen", result);


    }
}
