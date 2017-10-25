package com.projects.players;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot Applciation //need 3 annotation tags and declare spring application
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.projects.players")
public class PlayersApplication 
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(PlayersApplication.class, args);
    	System.out.println("Running the server.. Success");
    }
}
