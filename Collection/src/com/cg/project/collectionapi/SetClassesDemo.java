package com.cg.project.collectionapi;

import java.util.*;

import javax.net.ssl.HandshakeCompletedListener;

import com.cg.project.beans.Employee;

public class SetClassesDemo {
	public static void EmpSetWork(){
		HashSet<Employee> empList=new HashSet<>();
		empList.add(new Employee(1,91000,"A","KS"));
		empList.add(new Employee(5,13100,"B","G"));
		empList.add(new Employee(2,12400,"D","C"));
		empList.add(new Employee(4,15050,"Z","P"));
		empList.add(new Employee(6,17800,"D","J"));
		empList.add(new Employee(3,10060,"E","X"));
		for (Employee  employee : empList) {
			System.out.println(employee);
		}
	
	}
	
	

}
