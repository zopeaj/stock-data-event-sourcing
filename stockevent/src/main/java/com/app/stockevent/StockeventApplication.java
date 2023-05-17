package com.app.stockevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;

@EnableRabbit
@SpringBootApplication
public class StockeventApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockeventApplication.class, args);
	}

}
