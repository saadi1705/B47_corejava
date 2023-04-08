package com.tns.nullpointerexception;

public class DefaultExecutor 
{
	public static void main(String[] args) 
	{
		String a = null;
		try {
			a.equals("hello");
		}
		catch(Exception e) {
			System.out.println("Null pointer Exception");
		}

	}
}