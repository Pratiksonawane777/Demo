package com.in.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServerApplication.class,args);
        System.out.println( "Hello World!");
    }
}
