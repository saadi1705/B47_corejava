package com.tns.designpattern;

public class SingletonLazy 
{
 private static SingletonLazy instance;
 
 private SingletonLazy()
 {
	 
 }
 public static SingletonLazy getinstance()
 {
	 if(instance==null)
	 {
		 instance=new SingletonLazy();
	 }
	 return instance;
 }
}