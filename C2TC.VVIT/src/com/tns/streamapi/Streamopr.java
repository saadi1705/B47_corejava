package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamopr 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// source in the form of array
		List<String> gs = Arrays.asList("INDIA","USA","NEPAL","PAKISTAN","BANGLADESH");
		
		// create a stream
		Stream<String> gc = gs.stream();
		
		// Intermediate operation
		Stream<String> pc = gc.map(x->x.toLowerCase());
		
		// Terminal operation
		String terminal = pc.collect(Collectors.joining(","));
		System.out.println(terminal);

	}
}