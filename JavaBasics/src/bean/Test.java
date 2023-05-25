package bean;

import java.util.Arrays;
import java.util.List;


public class Test {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("John", Employee.GENDER.MALE, 3000), 
				new Employee("Sarah", Employee.GENDER.FEMALE, 4000),
				new Employee("Jones", Employee.GENDER.MALE, 3000), 
				new Employee("Vicky", Employee.GENDER.MALE, 4000), 
				new Employee("Andrew", Employee.GENDER.MALE, 6000),
				new Employee("Emma", Employee.GENDER.FEMALE, 5000),
				new Employee("Hanna", Employee.GENDER.FEMALE, 4000));

		System.out.println("AVG Salary of all Employee: " + getAverageSalary(employees, null));
		System.out.println("AVG Salary of MALE Employee: " + getAverageSalary(employees, Employee.GENDER.MALE));
		System.out.println("AVG Salary of FEMALE Employee: " + getAverageSalary(employees, Employee.GENDER.FEMALE));


	}
	
	public static double getAverageSalary(List<Employee> employee, Employee.GENDER gender) {
		if(gender != null) {                                                                
			return employee.stream().filter(e -> e.getGender() == gender).mapToInt(Employee::getSalary).average().orElse(0.0);
		}
		return employee.stream().mapToInt(Employee::getSalary).average().orElse(0.0);
	}

}

class Employee {

	enum GENDER {MALE, FEMALE}

	String name;
	GENDER gender;
	int salary;

	public Employee(String name, GENDER gender, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

