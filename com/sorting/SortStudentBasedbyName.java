package com.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudentBasedbyName implements Comparator<Student>
{

	@Override
	public int compare(Student s1,Student s2 ) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}

}
