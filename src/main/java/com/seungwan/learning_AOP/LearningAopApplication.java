package com.seungwan.learning_AOP;

import com.seungwan.learning_AOP.aopexample.business.BusinessService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningAopApplication implements CommandLineRunner {

	private BusinessService1 businessService1;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public LearningAopApplication(BusinessService1 businessService1) {
		this.businessService1 = businessService1;
	}



	public static void main(String[] args) {
		SpringApplication.run(LearningAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		logger.info("Value returned is {}", businessService1.calculateMax());
	}

}
