package com.tns.designpattern;

public class SingletonSynchronized 
{
  private static SingletonSynchronized  instance;
  
  private SingletonSynchronized ()
  {
	  
  }
  
  public static synchronized SingletonSynchronized getInstance()
  {
	  if(instance==null)
	  {
		  instance=new SingletonSynchronized ();
	  }
	  return instance;
  }
}