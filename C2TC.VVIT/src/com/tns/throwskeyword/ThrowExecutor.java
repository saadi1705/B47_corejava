package com.tns.throwskeyword;

public class ThrowExecutor 
{
	public static void main(String[] args) 
	{
		try 
		{
			
			ThrowDemo.avg();
		}
		catch(ArithmeticException e) 
		{
			 System.out.println("caugth"+e);
	    }
	}
}