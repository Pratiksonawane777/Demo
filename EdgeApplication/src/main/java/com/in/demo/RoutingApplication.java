package com.in.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class RoutingApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(RoutingApplication.class, args);

        System.out.println( "Hello World!" );
    }
}
