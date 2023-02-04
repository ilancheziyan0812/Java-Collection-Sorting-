package com.sorting1;

import java.util.Comparator;

public class SortEmployeeByMarks implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		Double x = e1.getMarks();
		Double y = e2.getMarks();
		return x.compareTo(y);
	}

}
