package com.tns.abstraction;

public class AbstractExecutor 
{
  public static void main(String[] args) 
  {
	Square sq=new Square();
	Rectangle r=new Rectangle();
	sq.calArea();
	sq.show();
	r.calArea();
	r.show();
	
	//use the concept of function overloading
	//Shape ash=new Shape(); //cannot create an object of abstract class
	Shape s=new Square(3.0f);  //I can create a reference and i can access it 
	s.calArea();
	s.show();
	s=new Rectangle(10.0f,2.0f);
	s.calArea();
	s.show"();
  }
}