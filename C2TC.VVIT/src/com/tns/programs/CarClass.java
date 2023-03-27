package com.tns.programs;
//Program to demonstrate class and objects

public class CarClass 
{
   //DataMembers for the class
  int model;    
  String color;
  int reg=2019;
  int amount=90000;
   
  //function members for the class
  void forward()   
  {
	 System.out.println("Car is moving in forward direction"); 
  }
  void backward()
  {
	  System.out.println("Car is moving in backward direction"); 
  }
  void stop()
  {
	  System.out.println("Car is not moving"); 
  }
}