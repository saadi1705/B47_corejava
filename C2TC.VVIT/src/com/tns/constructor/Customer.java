package com.tns.constructor;
// Program to demonstrate constructor and getter and setter
public class Customer 
{
  private String customerName;
  private int customerId;
  private String customerCity;
   
  //Default Constructor
  public Customer() 
  {
		
  }
  
  //parameterized Constructor
  public Customer(String customerName, int customerId, String customerCity) 
  {
	this.customerName = customerName;
	this.customerId = customerId;
	this.customerCity = customerCity;
	System.out.println("parameterized const");
	System.out.println("name"+" " +customerName+ "id" +" " + customerId+ "city" +" "+customerCity);
  }

  public String getCustomerName() 
  {
	return customerName;
  }
  public void setCustomerName(String customerName) 
  {
	this.customerName = customerName;
  }
  public int getCustomerId() 
  {
	return customerId;
  }
  public void setCustomerId(int customerId) 
  {
	this.customerId = customerId;
  }
  public String getCustomerCity() 
  {
	return customerCity;
  }
  public void setCustomerCity(String customerCity) 
  {
	this.customerCity = customerCity;
  }
  
}