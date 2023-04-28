package com.tns.streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAllOperation 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Count the empty strings
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); //source
		long count = strList.stream() //creation of stream
				.filter(x -> x.isEmpty())
				.count();
		System.out.printf("List %s has %d empty strings %n", strList, count);
		
		// Count String with length more than 3
		long num = strList.stream() // creation of stream
				.filter(x -> x.length() > 3)
				.count();
		System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
		
		// Remove all empty Strings from List
		List<String> filtered = strList.stream()
				.filter(x -> !x.isEmpty())
				.collect(Collectors.toList());
		System.out.printf("Original List: %s, List without Empty Strings : %s %n", strList, filtered);
		
		// Create a List with String more than 2 characters
		filtered = strList.stream()
				.filter(x -> x.length() > 2)
				.collect(Collectors.toList());
		System.out.printf("Original List: %s, Filtered List : %s %n", strList, filtered);
		
		// Create List of square of all distinct numbers
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream()
				.map(i -> i*i).distinct()
				.collect(Collectors.toList());
		System.out.printf("Original List: %s, Square without Duplicates : %s %n", numbers, distinct);
		
		// Get count, min, max, sum, and average for numbers
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream()
				.mapToInt((x) -> x)
				.summaryStatistics();
		System.out.printf("Highest prime number in List : " + stats.getMax());
		System.out.printf("Lowest prime number in List : " + stats.getMin());
		System.out.printf("Sum of all prime numbers : " + stats.getSum());
		System.out.printf("Average of all prime numbers : " + stats.getAverage());

	}
}