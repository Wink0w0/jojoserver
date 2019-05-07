package com.zxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class JojoserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JojoserverApplication.class, args);
	}

}
