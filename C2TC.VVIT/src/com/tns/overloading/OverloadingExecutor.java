package com.tns.overloading;

public class OverloadingExecutor 
{
   public static void main(String[] args) 
   {
	 Point ob=new Point();   //default constructor is called
	 System.out.println(ob);
	 
	 Point ob1=new Point(14.5f);
	 System.out.println(ob1);
	 
	 Point ob2=new Point(14.5f,2.5f);
	 System.out.println(ob2);
   }
}