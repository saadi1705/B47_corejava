package com.tns.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExecutor 
{
   public static void main(String[] args) 
   {
	LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
	l.add(1);
	l.add(2);
	l.add(5);
	l.add(null);
	l.add(0);
	System.out.println(l);
   }
}