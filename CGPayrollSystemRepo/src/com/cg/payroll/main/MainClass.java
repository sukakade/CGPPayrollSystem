package com.cg.payroll.main;


import com.cg.payroll.beans.BankDetail;
import com.cg.payroll.beans.Employee;
import com.cg.payroll.beans.Salary;

public class MainClass {

	public static void main(String[] args) {
		Employee	emp[]=new Employee[10];		
emp[0]=new Employee(91,"Suraj","Kakade", "suraj@gmail.com", "EYSPK2418", "IT", "SA",new BankDetail(587877800,"UBIN109", "UBI"),new Salary(10000, 500,600,400, 250,1200, 800,20000));
System.out.println("NET SALARY="+emp[0].getSalary().getNetSalary());

emp[1]=new Employee(92,"Bhola","Singh", "bhola@gmail.com", "SPK2418", "IT", "SA",new BankDetail(587877800,"UBIN109", "UBI"),new Salary(9000, 500,600,400, 250,1200, 800,20000));
emp[2]=new Employee(93,"Gaurav","Shetty", "gaurav@gmail.com", "CCSPK2418", "Tech", "SA",new BankDetail(997877800,"HDFC899", "HDFC"),new Salary(9900, 500,600,400, 250,1200, 800,20000));
		
	}

}
