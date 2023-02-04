package com.sorting1;

public class Employee 
{
private String name;
private double marks;

Employee (String name,double marks)
{
	this.name = name;
	this.marks= marks;
	}

public void setName(String name)
{
	this.name = name;
}
public String getName()
{
	return name;
}
public void setMarks(double marks)
{
	this.marks=marks;
}
public double getMarks()
{
	return marks;
}
public String toString()
{
	return "Name "+name+"Marks "+marks;
}

}
