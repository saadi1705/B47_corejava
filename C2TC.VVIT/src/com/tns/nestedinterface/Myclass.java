package com.tns.nestedinterface;

public class Myclass implements Outer
{
	@Override
	public void m1()
	{
		System.out.println("Outer interface");
	}
    public static void main(String[] args) 
    { 
		Myclass mc=new Myclass();
		mc.m1();
		System.out.println(mc);
	}
}