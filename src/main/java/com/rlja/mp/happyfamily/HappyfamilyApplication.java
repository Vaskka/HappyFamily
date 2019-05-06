package com.rlja.mp.happyfamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HappyfamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyfamilyApplication.class, args);
	}

}
