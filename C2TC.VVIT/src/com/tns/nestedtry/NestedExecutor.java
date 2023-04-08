package com.tns.nestedtry;

import java.util.Scanner;

public class NestedExecutor 
{
  public static void main(String[] args) 
  {
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the value of x and y");
	int x=ob.nextInt();
	int y=ob.nextInt();
	System.out.println("value of x and y "+x + " " +y);
	
	NestedTry obj=new NestedTry();
	obj.nestedtry(x,y);
  }
}