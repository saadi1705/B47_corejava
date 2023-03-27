package com.tns.packagetwo;

import com.tns.packageone.Base;

public class SubClass 
{
  public static void main(String[] args) 
  {
	Base b=new Base();
	b.methodPublic();
	//b.methodDefault();
	//b.methodProtected();
	//b.methodPrivate();	
  }
}