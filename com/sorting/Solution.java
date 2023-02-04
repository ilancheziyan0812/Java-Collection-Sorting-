package com.sorting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Solution {
	public static void main(String[] args) {
		Student s1 = new Student (20,"john",45);  // 45 ---> 55,65,75,49.
		Student s2 = new Student (50,"alen",55);
		Student s3 = new Student (30,"jack",65);
		Student s4 = new Student (10,"smith",75);
		Student s5 = new Student (40,"king",49);
		Map<Integer,Student> map =new LinkedHashMap<Integer,Student> ();//(int,double) primitive not support so using wrapper class
		map.put(s1.getId(),s1);// getId because attribute is private
		map.put(s2.getId(),s2);
		map.put(s3.getId(),s3);
		map.put(s4.getId(),s4);
		map.put(s5.getId(),s5);
		//Convert map into Set of key after add the object in to th8e ArrayList
		Set<Integer> keys = map.keySet();//20 50 30 10 40
		System.out.println("Entries present inside Map");
		for(int key : keys)
		{
			System.out.println(map.get(key)); // printing s1 s2 s3 s4 s5
		}
		System.out.println("-------------");
		//add the values from the map into ArrayList
		List<Student> list = new ArrayList<Student>();
		for(int key : keys)
		{
			Student obj = map.get(key);// Student obj = new Student(10,"a",23)
			list.add(obj);//l.add(map.get(key));// getting s1s2s3s4s5
		}
		System.out.println("Objects present in list");
		for(Student s : list)
		{
			System.out.println(s);
		}
		System.out.println("-------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Sort By Id\n2:Sort By Name\n3: Sort By marks\n4Enter Choice:");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			Collections.sort(list, new SortStudentbyId());
			for(Student s : list)
			{
				System.out.println(s);
			}
			break;

		case 2:
			Collections.sort(list, new SortStudentBasedbyName());
			for(Student s : list)
			{
				System.out.println(s);
			}
			break;

		case 3:
			Collections.sort(list, new SortStudentbyMark());
			for(Student s : list)
			{
				System.out.println(s);
			}
			break;
			
			
		}

	}

}
