package com.tns.staticprogram;

public class EmployeeExecutor 
{
  public static void main(String[] args) 
  {
	Employee ob1=new Employee();
	System.out.println(Employee.companyName);
	Employee ob=new Employee("SAADI",123);
	System.out.println(ob);
	
	Employee ob2=new Employee();
	System.out.println(Employee.companyName);
	ob=new Employee("HASSAN",456);
	System.out.println(ob);
  }
}