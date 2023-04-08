package com.tns.userdefinedexception;

public class InvalidAge extends Exception
{
	InvalidAge(String str)
	{
		super(str);
	}
}