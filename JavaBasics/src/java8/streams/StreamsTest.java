package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Customer;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		} 
		for(int i=1;i<=5;i++) {
			list.add(i);
		}

		System.out.println("List "+list);
		filterByStreams(i -> i%2 == 0, list);
		filterByStreams(i -> i%2 != 0, list);
		filterByStreams(i -> i%3 == 0, list);
		filterByStreams(i -> i%4 == 0, list);
		List<Customer> customerList= Customer.getCustomerList();
		System.out.println("***customer.getAge()>30****");
		filterByCustomerStreams(customer -> customer.getAge()>30,customerList);
		System.out.println("***customer.getAge()>20 && customer.getAge()<30***");
		filterByCustomerStreams(customer -> customer.getAge()>20 && customer.getAge()<30 ,customerList);
		System.out.println("***customer.getAge()<20***");
		filterByCustomerStreams(customer -> customer.getAge()<20,customerList);
		System.out.println(list.stream().allMatch(i-> i%2==0));
		System.out.println(list.stream().anyMatch(i-> i%2==0));
		System.out.println(list.stream().count());
		System.out.println(list.stream().map(i->i*2).collect(Collectors.toList()));
		System.out.println(customerList.stream().map(c->c.getAge()+5).collect(Collectors.toList()));
		System.out.println(list.stream().distinct().toList());
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList()));
		System.out.println(customerList.stream().sorted(Customer::sortByName).distinct().collect(Collectors.toList()));
		getOptionalValue("KirubaVinoth");
		getOptionalValue(null);
		list.forEach(i-> System.out.println(i));
		
		List<List<String>> nestedList = new ArrayList<>();
		nestedList.add(Arrays.asList("A","B","c"));
		System.out.println("Nested List : "+ nestedList);
		System.out.println(nestedList.stream().flatMap(l -> l.stream()).map(s -> s.toLowerCase()).collect(Collectors.toList()));
		
		int i=20;
		Integer integer = 10;
		
		String s = "testte";
		s.chars().mapToObj(c -> (char) c).collect( Collectors.groupingBy(c->c, Collectors.counting()));

	}
	private static void filterByCustomerStreams(Predicate<Customer> predicateInt, List<Customer> customerList) {
		// TODO Auto-generated method stub
		List<Customer> newCustomerList = customerList.stream().filter(predicateInt).collect(Collectors.toList());
		System.out.println(newCustomerList);
	}
	public static void filterByStreams(Predicate<Integer> predicateInt,List<Integer> list) {
		List<Integer> newList = list.stream().filter(predicateInt).collect(Collectors.toList());
		System.out.println(newList);

	}
	public static void getOptionalValue(String str)
	{
		Optional<String> checkNull = Optional.ofNullable(str);  
		if(checkNull.isPresent())
				{
			System.out.println(checkNull.get()); 
			 
			System.out.println(str.toLowerCase());  
		}
		  

	}  


}




