package com.learning.spring.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntroApplication {
	
	// what are the beans?
	// what are the dependencies of the beans?
	// where to search for beans? no need bc we're in the same package
	

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(IntroApplication.class, args);
		
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {1, 2, 3}, 2);
		System.out.println(result);

		
	}
}
