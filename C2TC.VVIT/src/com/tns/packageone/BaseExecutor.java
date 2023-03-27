package com.tns.packageone;

public class BaseExecutor 
{
  public static void main(String[] args) 
  {
	Base b=new Base();
	b.methodDefault();
	b.methodPublic();
	b.methodProtected();
	//b.methodPrivate(); // can't access outside the class
	
	b.varDefault=21;
	b.methodDefault();
	
	/*b.varPrivate=33;
	  b.methodPrivate();*/
	
	b.varPublic=65;
	b.methodPublic();
	System.out.println(b instanceof Base);
  }
}