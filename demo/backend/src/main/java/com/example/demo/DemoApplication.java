package com.example.demo;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@PreDestroy
	public void onDestroy()
	{
		System.out.println("destroyyyy");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner printBeans(ApplicationContext ctx) {
		return args -> {
			String[] beanNames = ctx.getBeanDefinitionNames();
			System.out.println("=== Registered Beans ===");
			for (String name : beanNames) {
				System.out.println(name);
			}
			System.out.println("s");
		};
	}
}
