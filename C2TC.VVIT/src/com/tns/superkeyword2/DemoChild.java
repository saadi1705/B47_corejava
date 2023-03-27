package com.tns.superkeyword2;

import com.tns.superkeyword1.DemoParent;

public class DemoChild extends DemoParent
{
  protected void test()
  {
	  System.out.println("Child class");
  }
  void display()
  {
	  super.test();
  }
}