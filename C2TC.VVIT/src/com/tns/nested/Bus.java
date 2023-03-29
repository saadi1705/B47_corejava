package com.tns.nested;

public class Bus implements VehicleTypes.Vehicle
{
	@Override
	public int getNoofWheels()
	{
		return 6;
	}
	public static void main(String[] args) 
	{
		Bus b=new Bus();
		System.out.println(b.getNoofWheels());
	}
}