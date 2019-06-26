package com.cg.project.beans;

public class Employee implements Comparable<Employee>{
private int id,basicSalary;
private String firstName,lastName;
public Employee() {}
public Employee(int id, int basicSalary, String firstName, String lastName) {
	super();
	this.id = id;
	this.basicSalary = basicSalary;
	this.firstName = firstName;
	this.lastName = lastName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(int basicSalary) {
	this.basicSalary = basicSalary;
}
public String getfirstName() {
	return firstName;
}
public void setfirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + basicSalary;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + id;
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (basicSalary != other.basicSalary)
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (id != other.id)
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", basicSalary=" + basicSalary + ", firstName=" + firstName + ", lastName="
			+ lastName + "]";
}
	
public int compareTo(Employee o){
return this.firstName.compareTo(o.firstName);

}




}//emp


