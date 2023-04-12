package com.tns.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Executor 
{
  public static void main(String[] args) 
  {
	ArrayList<Student> st=new ArrayList<Student>();
	st.add(new Student(222,"Saadi","bangalore"));
	st.add(new Student(242,"Hassan","mysore"));
	st.add(new Student(122,"Iqra","delhi"));
	System.out.println("unsorted array");
	
	for(int i=0;i<st.size();i++)
	{
		System.out.println(st.get(i));
		System.out.println("----------------");
		
		Collections.sort(st,new SortbyRollno());
		System.out.println("Sorting by rollno");
		for(int i1=0;i1<st.size();i1++)
			System.out.println(st.get(i1));
		
		Collections.sort(st,new SortbyName());
		System.out.println("Sorting by name");
		for(int i1=0;i1<st.size();i1++)
			System.out.println(st.get(i1));
	    
	}
  }
}