package bean;

public class Employee1 implements Comparable<Employee1>{
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	public Employee1() {
		System.out.println("Employee");
	}
	
	public Employee1(int id) {
		this.id=id;
		System.out.println("Employee : "+ id);
	}
	
	public Employee1(int id, String firstName) {
		this.id=id;
		this.firstName = firstName;
		System.out.println("Employee: "+ id+" "+firstName);
	}
	
	public Employee1(int id, String firstName, String lastName) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Employee: "+ id+" "+firstName);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public static String getFullNameInUpperCase(String firstName, String lastString) {
		return firstName.toUpperCase()+" "+lastString.toUpperCase();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee1 emp = (Employee1) obj;
		return emp.getId().equals(this.id);
	}
	
	@Override
	public int hashCode() {
		return 33*this.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		return this.id.compareTo(o.getId());
	}
	
	
}
