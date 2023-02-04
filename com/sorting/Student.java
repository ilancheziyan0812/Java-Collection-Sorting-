package com.sorting;

public class Student {
   private int id;
   private String name;
   private int mark;
   
   Student(int id,String name,int mark)
   {
	   this.id=id;
	   this.name=name;
	   this.mark=mark;
   }
   // getter () and toString()
   public int getId()
   {
	   return id;
   }
   public String getName()
   {
	   return name;
   }
   public int getMark()
   {
	   return mark;
   }
   public String toString()
   {
	   return ("id: "+id+"  name: "+ name+"  mark: "+mark);
   }
   
}
