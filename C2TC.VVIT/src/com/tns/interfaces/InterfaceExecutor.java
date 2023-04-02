package com.tns.interfaces;

//program to demonstrate Interface
public class InterfaceExecutor 
{
  public static void main(String[] args) 
  {
	 Shape s=new Rectangle(2.5f,10.0f);
	 System.out.println("area " +s.calculateArea());
	 System.out.println("perimeter "+s.calculatePerimeter());
  }
}