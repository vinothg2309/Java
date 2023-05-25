package bean;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Customer implements Comparable<Customer> {

	private Integer id;
	private String name;
	private Integer age;
	private List<Address> addresses;
	private static  List<Customer> customerList;

	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	public Customer(Integer id,String name,Integer age)
	{
		this.id= id;
		this.name= name;
		this.age= age;

	}
	public Customer()
	{

	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", addresses=" + addresses + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return o.getName().compareTo(this.name);
	}
	
	
	  public static int sortByName(Customer o1, Customer o2) { return
	  o2.getName().compareTo(o1.getName()); }
	 
	
	public static Comparator<Customer> sortByName = new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o2.getName().compareTo(o1.getName());
		}
		
	};
	
	static class NameComparator implements Comparator<Customer>
	{

		@Override
		public int compare(Customer o1, Customer o2) {
			return o2.getName().compareTo(o1.getName());
		}
	    
	}
	
	static {
		customerList =new ArrayList<>();
		customerList.add(new Customer(1,"Kiruba",27));		
		customerList.add(new Customer(2,"vinoth",34));	
		customerList.add(new Customer(3,"Krithin",2));	
	}
	public static List<Customer> getCustomerList()
	{
		return customerList;
	}


}


