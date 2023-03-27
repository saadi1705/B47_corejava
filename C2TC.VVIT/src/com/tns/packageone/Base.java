package com.tns.packageone;

public class Base 
{
	//Declaring access specifier.
     int varDefault=10;  //no access specifier then it is default.
     public int varPublic=20;
     private int varPrivate=30;
     protected int varProtected=40;
     
     //Declaring access specifier for methods
     void methodDefault()   //default method
     {
    	 System.out.println("default access base class");
    	 System.out.println("default variable"+varDefault);
     }
     public void methodPublic()   //Public method
     {
    	 System.out.println("public access base class");
    	 System.out.println("public variable"+varPublic);
     }
     private void methodPrivate()   //Private method
     {
    	 System.out.println("private access base class");
    	 System.out.println("private variable"+varPrivate);
     }
     protected void methodProtected()   //Protected method
     {
    	 System.out.println("protected access base class");
    	 System.out.println("protected variable"+varProtected);
     }

}