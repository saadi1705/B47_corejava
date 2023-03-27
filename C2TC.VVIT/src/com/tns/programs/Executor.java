package com.tns.programs;

import java.util.Scanner;

public class Executor 
{
  public static void main(String[] args) 
  {
	CarClass ob=new CarClass();    //creation of object
	ob.forward();   //calling member function of the CarClass
	ob.backward();
	ob.stop();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter: ");
	int reg=sc.nextInt();
	/*System.out.println("reg is "+ob.reg);
	System.out.println("amount is "+ob.amount);*/
  }
}