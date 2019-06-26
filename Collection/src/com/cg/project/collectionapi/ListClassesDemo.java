package com.cg.project.collectionapi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

import javax.swing.RowFilter.ComparisonType;

import com.cg.project.beans.Employee;

public class ListClassesDemo {
/*public static void ArrayListWork(){

ArrayList<String> stringList=new ArrayList<>();
	stringList.add("Suraj");
	stringList.add("Pankaj");
	stringList.add("Rajendra");
	stringList.add("Umesh");
	stringList.add("Shankar");
	stringList.add("Pramod");
	stringList.add("Akshay");
	stringList.add("Sandy");
	stringList.add("Rushabh");
	
	//index base access
	System.out.println(stringList.get(3));
	
	//search
	System.out.println(stringList.contains("Akshay"));
	System.out.println("Index of Rushabh ="+stringList.indexOf("Rushabh"));
	Collections.sort(stringList);
	System.out.println(stringList);

}
public static void LinkedListWork(){

LinkedList<String> stringList=new LinkedList<>();
	stringList.add("Suraj");
	stringList.add("Pankaj");
	stringList.add("Rajendra");
	stringList.add("Umesh");
	stringList.add("Shankar");
	stringList.add("Pramod");
	stringList.add("Akshay");
	stringList.add("Sandy");
	stringList.add("Rushabh");
	
	//index base access
	System.out.println(stringList.get(3));
	
	//search
	System.out.println(stringList.contains("Akshay"));
	System.out.println("Index of Rushabh ="+stringList.indexOf("Rushabh"));
	Collections.sort(stringList);
	System.out.println(stringList);

}
*/
	
	public static void EmpListWork(){
	ArrayList<Employee> empList=new ArrayList<>();
	empList.add(new Employee(1,91000,"Suraj","Kakade"));
	empList.add(new Employee(5,13100,"Pankaj","Gangawane"));
	empList.add(new Employee(2,12400,"Bhagat","Chetan"));
	empList.add(new Employee(4,15050,"Chetan","Pandav"));
	empList.add(new Employee(6,17800,"Govind","shetty"));
	empList.add(new Employee(3,10060,"Bhola","Kande"));

	Collections.sort(empList);
			for (Employee employee : empList) {
				System.out.println(employee);
			}
	
	
	Collections.sort(empList,new EmployeeComparator());
	for (Employee employee : empList) {
		System.out.println(employee);
	}

	
	}

	

	
	
	
	}


