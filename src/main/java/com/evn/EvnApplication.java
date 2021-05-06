package com.evn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.evn.*" })
@SpringBootApplication
public class EvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvnApplication.class, args);
	}

}
