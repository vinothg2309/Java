package bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust	= 	new  Customer();
		List<Address> addresses =  new ArrayList<>();
		addresses.add(new Address("a", "b", "c"));
		addresses.add(new Address("E", "V", "TN"));
		cust.setId(1);
		cust.setName("A");
		cust.setAge(24);
		cust.setAddresses(addresses);
		System.out.println("id " +cust.getId() + cust.getName()+cust.getAge() +cust.getAddresses());
		
		Set<Customer> hashSet = new HashSet<>();
		hashSet.add(new Customer(1, "a", 24));
		hashSet.add(new Customer(3, "b", 44));	
		hashSet.add(new Customer(3, "v", 34));
		System.out.println(hashSet);
		
		
		Map<Integer, Customer> linkHashMap= new LinkedHashMap<>();
		linkHashMap.put(1,new Customer(1, "a", 24));
		linkHashMap.put(3, new Customer(3, "b", 44));
		linkHashMap.put(3, new Customer(3, "t", 74));
		System.err.println(linkHashMap);
		
		Map<Customer,Integer> treeMap= new TreeMap<>();
		treeMap.put(new Customer(1, "w", 24),1);
		treeMap.put( new Customer(3, "b", 44),3);
		treeMap.put( new Customer(3, "t", 74),2);
		System.err.println(treeMap);
	}

}
