package com.cg.payroll.beans;

public class Employee {
		private int id;
		private String firstName,lastName,emailid,pancard,department,designation;
		private BankDetail bankDetail;
		private Salary salary;
		
		public Employee() {}

		public Employee(int id, String firstName, String lastName, String emailid, String pancard, String department,
				String designation, BankDetail bankDetail, Salary salary) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailid = emailid;
			this.pancard = pancard;
			this.department = department;
			this.designation = designation;
			this.bankDetail = bankDetail;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getPancard() {
			return pancard;
		}

		public void setPancard(String pancard) {
			this.pancard = pancard;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public BankDetail getBankDetail() {
			return bankDetail;
		}

		public void setBankDetail(BankDetail bankDetail) {
			this.bankDetail = bankDetail;
		}

		public Salary getSalary() {
			return salary;
		}

		public void setSalary(Salary salary) {
			this.salary = salary;
		}
		
		


}//class
