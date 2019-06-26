package com.cg.project.collectionapi;
import java.util.Comparator;
import com.cg.project.beans.Employee;;
public class EmployeeComparator implements Comparator<Employee>{
public int compare(Employee e1, Employee e2) {
	 return e1.getBasicSalary()-e2.getBasicSalary();
}
}
