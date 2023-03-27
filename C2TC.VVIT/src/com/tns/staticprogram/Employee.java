package com.tns.staticprogram;

public class Employee 
{
  // Declare instance variable
  private String name;
  private int salary;
  
  //Declare a static variable
  static String companyName="TNS";
  static int id=0;
  
  Employee()
  {
	 id++;
	 System.out.println("the id is "+id);
  }
  
  Employee(String name,int salary)
  {
	  this.name=name;
	  this.salary=salary;
  }
  
@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + "]";
}
}