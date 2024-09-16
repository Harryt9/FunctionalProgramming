package com.fplearn.fp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestFunctionalProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.from(FunctionalProgrammingApplication::main).with(TestFunctionalProgrammingApplication.class).run(args);
	}

}
