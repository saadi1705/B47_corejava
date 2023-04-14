package com.tns.lambdaexpression;

public class LambdaWithoutParameter 
{
  public static void main(String[] args) 
  {
	Statement s=()->{return "hello world";};
	System.out.println(s.greet());
  }
}