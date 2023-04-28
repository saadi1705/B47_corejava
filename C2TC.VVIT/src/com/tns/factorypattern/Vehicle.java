package com.tns.factorypattern;

abstract class Vehicle 
{
  public abstract int getWheel();
  public String toString()
  {
	  return "Wheel"+this.getWheel();
  }
}