package com.tns.synchronisation;

//method synchronization
public class MethodSync implements Runnable 
{
	int tickets=3;
	int i=1;
	synchronized void bookticket(String name,int wantedtickets) 
	{
		if(wantedtickets<=tickets) 
		{
			System.out.println(wantedtickets+"booked to"+name);
			tickets=tickets-wantedtickets;
		}
		else 
		{
			System.out.println("no tickets booked");
		}
	}
	@Override
	public void run() 
	{
		String name=Thread.currentThread().getName();
		System.out.println("current thread is "+name);
	if(name.equals("first thread")) 
	{
		bookticket(name,i);
	}
	else if(name.equals("second thread")) 
	{
		bookticket(name,i);
	}
	else 
	{
		bookticket(name,i);
	}
	}

}