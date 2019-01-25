package com.example.testgenericscan;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestGenericScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestGenericScanApplication.class, args);
	}

	//@Bean
	public Context<Pair<String, Integer>> testBean() {
		return new TestBean();
	}

	@Bean
	public ApplicationRunner runner(Context<Pair<String, Integer>> context) {
		return arguments -> System.out.println(context.getTarget());
	}

}

