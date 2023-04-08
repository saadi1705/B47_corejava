package com.tns.nestedtrytwo;

//demonstrate that invoking ArithmeticException & NullPointerException nested
public class NestedTry 
{
	int nestedtry(int x, int y, String ptr, int a[])
	{
		int z = 0;
		// outer (main) try block  
		try
	    {
			// Checking if ptr.equals null or works fine.
			if (ptr.equals("Hello"))
	            System.out.println("Same");
	        else
	            System.out.println("Not Same");
			
			//inner try block 1
			try {
				z = x/y;
				System.out.println(z);
				
				//inner try block 2
				try {  
				    //assigning the value out of array bounds  
				     a[5]=4;
					
				}
				catch(ArrayIndexOutOfBoundsException ab) {
					System.out.println("ArrayIndexOutOfBoundsException");
					
				}
			}
			// to handles ArithmeticException 
			catch(ArithmeticException ar) {
				System.out.println("ArithmeticException");
			}
			
	    }
		// This line of code throws NullPointerException
        // because pointer is null
	    catch(NullPointerException e)
	    {
	        System.out.println("NullPointerException");
	    }
		return z;
}
}