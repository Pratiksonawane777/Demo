package com.in.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class DiscoveryApplication
{

    public static void main( String[] args ) {
        SpringApplication.run(DiscoveryApplication.class, args);
        System.out.println( "Hello World!" );
    }
}
