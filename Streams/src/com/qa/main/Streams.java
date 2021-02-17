package com.qa.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> numbers = Arrays.asList(1, 2, 3, 34, 64, 2345, 234, 98);
//		List<Integer> squared = numbers.stream().map(x -> x * x).collect(Collectors.toList());
//		System.out.println(squared);
//		
//		List<String> sorted = 
//				names.stream()
//				.filter(i -> !i.startsWith("j"))
//				.collect(Collectors.toList());
//				System.out.println(sorted);
		
			System.out.println("Exercise One \n");
			PrintHello();
			
			System.out.println("\n===================== \n");
			
			System.out.println("Exercise Two \n");
			SumOfIntegers();
			
	}
			public static void PrintHello() {
				
				List<String> exerciseNames = Arrays.asList("Michael", "Dean", "James", "Chris");

						exerciseNames.stream() 
						.filter(i -> !i.startsWith("J"))
						.collect(Collectors.toList())
						.forEach(i -> System.out.println("Hello" + i));
						
//						names.stream()
//						.forEach(i -> System.out.println(i));
//						line above just prints all names in list
						
						
//						Ternary solution (if statements in lambda expressions)
//						Basically an if...else... statement
//						exerciseNames.stream()
//						.map(i -> !i.equals("James") ? "hello " + i : i)
//						.forEach(System.out::println);
			}
			
			public static void SumOfIntegers() {
				
				List<Integer> numbers = Arrays.asList(3,4,7,8,12);
				
				int sumOfInts = 
						numbers.stream()
						.reduce((a,b) -> a * b)
						.get();
						System.out.println(sumOfInts);
			
			}		
			
	}