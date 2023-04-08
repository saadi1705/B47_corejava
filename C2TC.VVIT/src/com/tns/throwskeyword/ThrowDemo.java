package com.tns.throwskeyword;

//program using throw
//throw is used inside the method
//used in checked exceptions
public class ThrowDemo 
{
	static void avg() 
	{
		System.out.println("avg is throwing exception");
	
			throw new ArithmeticException("done");
	}
}