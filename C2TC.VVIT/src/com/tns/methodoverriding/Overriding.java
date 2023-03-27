package com.tns.methodoverriding;

class Base
{
  void sum()
	{
		System.out.println("Sum");
	}
}
public class Overriding extends Base
{
	@Override
  void sum()
  {
	  System.out.println();
  }
}