package com.tns.multipleInheritance;

public class Vehicle implements Vehicleone,Vehicletwo
{
	@Override
	public void distance() 
	{
		int speed=distance/100;
		System.out.println("speed "+speed);
	}

	@Override
	public void speed() 
	{
		int distance=speed*100;
		System.out.println("distance travelled "+distance);
	}
	
	
}