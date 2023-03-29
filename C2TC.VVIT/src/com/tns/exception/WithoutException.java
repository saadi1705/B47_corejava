package com.tns.exception;

public class WithoutException 
{
  public static void main(String[] args) 
  {
	int d=0,a;
	try 
	{
		a=48/d;  //exception occurred here
		System.out.println("This will not be printed");
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Division by zero");
	}
	System.out.println("This will be printed");
	
  }
}