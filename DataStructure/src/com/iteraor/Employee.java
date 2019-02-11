package com.iteraor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Employee {
	private int empId;
	private String empName;
	private int age;

	public Employee(int empId, String empName, int age) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}

	public static Comparator<Employee> BY_NAME = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getEmpName().compareTo(e2.getEmpName());
		}

	};
	public static Comparator<Employee> BY_AGE = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getAge() - e2.getAge();
		}
	};

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "JavaDeveloper", 17));
		list.add(new Employee(101, "Developer", 27));
		list.add(new Employee(101, "DeveloperJava", 18));
		/* sort by Age */
		Collections.sort(list, Employee.BY_AGE);
		System.out.println(list.toString());
		/* sort by name */
		Collections.sort(list, Employee.BY_NAME);
		System.out.println(list.toString());
	}
}
