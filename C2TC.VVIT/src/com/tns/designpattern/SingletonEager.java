package com.tns.designpattern;

public class SingletonEager 
{
  // when we are defining the variable at the same time we are declaring
  private static SingletonEager instance=new SingletonEager();
  
  //Private constructor
  private SingletonEager()
  {
	  
  }
  
  //Public method to return the instance
  public static SingletonEager getInstance()
  {
	  //creating the instance
	  return instance;
  }
}