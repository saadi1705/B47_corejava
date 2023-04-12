package com.tns.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExecutor {

	public static void main(String[] args) 
	{
		ArrayList<Laptop> laps=new ArrayList<>();
		laps.add(new Laptop("Dell",16,80000));
		laps.add(new Laptop("asus",8,60000));
		laps.add(new Laptop("Apple",19,100000));
		Collections.sort(laps);
		for(Laptop l:laps)
		{
			System.out.println(l);
		}
	}

}