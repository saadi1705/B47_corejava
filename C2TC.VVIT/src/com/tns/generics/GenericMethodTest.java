package com.tns.generics;

public class GenericMethodTest 
{
  public <E> void displayArrayElements(E[] elements)
  {
	  for(E ele:elements)
	  {
		  System.out.println(ele);
	  }
  }
  public static void main(String[] args) 
  {
	  GenericMethodTest  obj=new GenericMethodTest();
	  Integer[] intarr= {10,20,30};
	  String[] strarr= {"java","program"};
	  obj.displayArrayElements(intarr);
	  obj.displayArrayElements(strarr);
  }
}