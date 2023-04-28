package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream 
{

	public static void main(String[] args) 
	{
		// specify the source using list
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(30);
		numbers.add(2);
		System.out.println(numbers);
		
		// creating the stream by using stream method
		Stream<Integer> st = numbers.stream();
		Set<Integer> se = st.collect(Collectors.toSet());
		System.out.println("set value are: "+se);

	}

}