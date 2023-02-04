package com.sorting1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Solution {
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Ajith" ,75.6);
		Employee e2 = new Employee("Ram" ,55.6);
		Employee e3 = new Employee("Suresh" ,65.6);
		Employee e4 = new Employee("Ramesh" ,45.6);
		Map<String,Employee> map = new LinkedHashMap<String,Employee>();
		//map.put(e1.getName(), e1);
		map.put(e1.getName(), e1);
		map.put(e2.getName(), e2);
		map.put(e3.getName(), e3);
		map.put(e4.getName(), e4);

		Set<String> keys = map.keySet();

		for(String key : keys)
		{
			System.out.println(key);
		}

		List<Employee> list = new LinkedList <Employee> ();

		for(String key : keys)
		{
			Employee obj = map.get(key);
			list.add(obj);
		}
		for(Employee e : list)
		{
			System.out.println(e);
		}
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1:SortbyName\n2:SortbyMarks\n3Exit");
			System.out.println("Enter your choice");
			switch(sc.nextInt())
			{
			case 1:
			{
				System.out.println("Sort by Name");
				Collections.sort(list,new SortEmployeeByName());
				for(Employee e :list)
				{
					System.out.println(e);
				}
				break;
			}
			case 2:
			{
				System.out.println("Sort by Marks");
				Collections.sort(list,new SortEmployeeByMarks());
				for(Employee e :list)
				{
					System.out.println(e);
				}
				break;
			}
			case 3:
			{
				System.out.println("thks u");
			}
			default :
			{
				try
				{
					throw new InvalidChoiceException("Invalid Choice,Please choose Valid Choice");
				}
				catch(InvalidChoiceException e)
				{
					System.out.println(e.getMessage());
				}
			}
			}
		}
	}
}
