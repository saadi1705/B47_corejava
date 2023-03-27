package com.tns.staticmethod;

public class Myclass 
{
  private static int section;
  private static int srNo;
  
  static 
  {
	System.out.println("inside the static block");
	srNo=100;
  }
  Myclass()
  {
	  System.out.println("Default Constructor");
	  srNo++;
	  section++;
  }
	  static void display() 
	  {
		  System.out.println("section" +section);
	  }
}