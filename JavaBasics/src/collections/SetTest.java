package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee1;

public class SetTest {

	public static void main(String[] args) {
		//insertValue( new HashSet<>());
		//insertValue( new LinkedHashSet<>());
		//insertValue( new TreeSet<>());
		insertEmployee(new HashSet<Employee1>());
		insertEmployee(new LinkedHashSet<Employee1>());
		insertEmployee(new TreeSet<Employee1>());
	}

	private static void insertEmployee(Set<Employee1> set) {
		set.add(new Employee1(3, "Krithin", "V"));
		set.add(new Employee1(1, "Vino", "G"));
		set.add(new Employee1(2, "Kiru", "K"));
		set.add(new Employee1(1, "Krithi", "V"));
		
		System.out.println(set);
	}

	private static void insertValue(Set<String> set) {
		String[] strArr = {"B", "D", "C", "A", "C"};
		List<String> al = Arrays.asList(strArr);
		set.addAll(al);
		System.out.println(set);
		if(set.contains("C")) {
			System.out.println("Duplicate");
		}
	}

}
