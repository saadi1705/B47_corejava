package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayExecutor 
{
  public static void main(String[] args) 
  {
	//Creating an ArrayList
	ArrayList<String> vvit=new ArrayList<String>();
	System.out.println(vvit);   //displaying the ArrayList
	vvit.add("Shifa");
	vvit.add("Moufeeka");
	vvit.add(null);
	vvit.add("Iqra");
	System.out.println(vvit);
	vvit.remove(2);
	System.out.println(vvit);
    //traversing the list
  for(String element:vvit)
  {
	  System.out.println(element);
  }
  System.out.println("total elements "+vvit.size());
  Collections.sort(vvit);
  System.out.println(vvit);
  Collections.reverse(vvit);
  System.out.println(vvit);
  vvit.clear();
  System.out.println(vvit);
 }
}