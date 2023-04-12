package com.tns.generics;

class GenericExample <T>
{
  T obj;  //generic object
  void add(T obj)  //
  {
	  this.obj=obj;
  }
  T get()  //passed generic object to the function
  {
	  return obj;
  }
}

public class GenericExecutor 
{
  public static void main(String[] args) 
  {
	GenericExample<String> obj=new GenericExample<String>();
	obj.add("hello");
	System.out.println(obj.get());
	
	GenericExample<Integer> obj1=new GenericExample<Integer>();
	obj1.add(123);
	System.out.println(obj1.get());
  }
}