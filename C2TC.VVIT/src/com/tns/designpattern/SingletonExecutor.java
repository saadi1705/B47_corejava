package com.tns.designpattern;

public class SingletonExecutor 
{
  public static void main(String[] args) 
  {
	  //Eager Initialization
//	  SingletonEager instance=SingletonEager.getInstance();
//	  System.out.println(instance);
//	  SingletonEager instanceone=SingletonEager.getInstance();
//	  System.out.println(instanceone);
	  
	  //Lazy Initialization
	  SingletonLazy instance=SingletonLazy.getinstance();
	  System.out.println(instance);
	  SingletonLazy instanceone=SingletonLazy.getinstance();
	  System.out.println(instanceone);
  }
}