package com.tns.comparator;

import java.util.Comparator;

public class SortbyRollno implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) 
	{
		return o2.rollno-o1.rollno;
	}
}