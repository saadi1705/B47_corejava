package com.tns.constructor;

//import java.util.Scanner;

public class ConstructorExecutor 
{
  public static void main(String[] args) 
  {
	/*Scanner sc=new Scanner(System.in);
	String name,city;
	int id;
	
	System.out.println("Enter customer name: ");
	name=sc.nextLine();
	
	System.out.println("Enter customer id: ");
	id=sc.nextInt();
	
	System.out.println("Enter customer city: ");
	city=sc.next();*/
		
	Customer ob=new Customer("SAADI", 48 ,"BANGALORE");
	/*ob.setCustomerName("SAADI");
	  ob.setCustomerId(48);
	  ob.setCustomerCity("BANGALORE");*/
	
	System.out.println(ob.getCustomerName()+ " " +ob.getCustomerId()+" "+ob.getCustomerCity());
  }
}