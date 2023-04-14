package com.tns.lambdaexpression;

public class LambdaWithParameters 
{
  public static void main(String[] args) 
  {
	int x=5;
	Cube c=(int a)->{return (a*a*a);};
	int res=c.calculate(x);
	System.out.printlns(res);
  }
}