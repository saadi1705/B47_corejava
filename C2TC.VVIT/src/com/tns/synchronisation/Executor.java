package com.tns.synchronisation;

public class Executor 
{
	public static void main(String[] args) 
	{
		MethodSync s= new MethodSync();//my class object
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		t1.setName("first thread");
		t2.setName("second thread");
		t3.setName("third thread");
		t1.start();
		t2.start();
		t3.start();
	}
}