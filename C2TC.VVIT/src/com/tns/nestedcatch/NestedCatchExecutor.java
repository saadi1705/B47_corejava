package com.tns.nestedcatch;

//Program to demonstrate nested catch
public class NestedCatchExecutor 
{
  int arr[]=new int[4];  //Declare an array
  void nestedCatch()
  {
	  try 
	  {
	   String str=null;
	   str.equals("Saadi");
	   arr[11]=20/0; //Arithmetic Exception occurred
	   arr[10]=5;  // Array Index out of bound exception
	   System.out.println("try block");
	  }
	  catch(ArithmeticException Ae)
	  {
		  System.out.println("A number cannot be divided by zero");  
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("Accessing array elements outside specified limit "+e);
	  }
	  catch(Exception e)
	  {
		 System.out.println("No exception match"); 
	  }
  }
}