package com.tns.overloading;

public class Point 
{
  private float x;
  private float y;
  // Constructor Overloading
  public Point()
  {
	  x=0.0f;
	  y=0.0f;
  }
  public Point(float x)
  {
	  this.x=x;
	  //this.y=y;
  }
  public Point(float x,float y) 
  {
	 this.x=x;
	 this.y=y;
  }
  @Override
  public String toString()   //object class method
  {
	  return "Overloading [x=" + x + ", y=" + y + "]"; 
  }
}