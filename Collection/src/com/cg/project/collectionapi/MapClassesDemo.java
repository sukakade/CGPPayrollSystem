package com.cg.project.collectionapi;

import java.util.HashMap;
import java.util.HashSet;

import com.cg.project.beans.Employee;

public class MapClassesDemo {
	public static void EmpMapWork(){
		HashMap<Integer,Employee> empMap=new HashMap<>();
		empMap.put(1,new Employee(1,91000,"A","KS"));
		empMap.put(5,new Employee(5,13100,"B","G"));
		empMap.put(2,new Employee(2,12400,"D","C"));
		empMap.put(4,new Employee(4,15050,"Z","P"));
		empMap.put(6,new Employee(6,17800,"D","J"));
		empMap.put(3,new Employee(3,10060,"E","X"));
			System.out.println(empMap);
}
}
