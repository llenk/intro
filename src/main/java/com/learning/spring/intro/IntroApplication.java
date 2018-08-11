package com.learning.spring.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		
		int result = binarySearch.binarySearch(new int[] {1, 2, 3}, 2);
		System.out.println(result);
		SpringApplication.run(IntroApplication.class, args);
		
	}
}
