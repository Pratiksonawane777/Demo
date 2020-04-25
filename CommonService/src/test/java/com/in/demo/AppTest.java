package com.in.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Unit test for simple DiscoveryApplication.
 */


@SpringBootApplication
public class AppTest
{
    public static void main(String[] args)
    {
        SpringApplication.run(AppTest.class, args);
        System.out.println("TestApp");
    }

}
