package com.tns.multithreading;

public class ThreadSecondExecutor 
{
	public static void main(String[] args) 
	{
		//create an object of my class and pass that object to Thread Class
		  CreatingThreadSecond mc=new CreatingThreadSecond();
		  Thread t=new Thread(mc);
		  t.start();
		  t.run();
	}
}