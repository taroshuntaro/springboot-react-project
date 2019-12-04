package com.taroshuntaro.demo.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan("com.taroshuntaro.demo.react")
//@EnableJpaRepositories("com.taroshuntaro.demo.react")
public class ReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactApplication.class, args);
	}

}
