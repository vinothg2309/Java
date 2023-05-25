package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {

	public static void main(String[] args) {

		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		//Write a java method that return most repeated city name from the given input array.
		//Make sure your logic should meet better complexity

		String[] cityNames={"Bangalore","Pune","Mumbai","Hyderabad","Bangalore","Pune","Bangalore","Hyderabad","Chennai","Hyderabad","Bangalore"};

		List<String> cities = Arrays.asList(cityNames);
		Map<String, Long> citiesCount = cities.stream().collect(Collectors.groupingBy(city -> city, Collectors.counting()));
		System.out.println(citiesCount);
		System.out.println(citiesCount.entrySet().stream().max(Comparator.comparing(e -> e.getValue())).get().getKey());
		String frequentCity =  cities.stream().collect(Collectors.groupingBy(city -> city, Collectors.counting())).entrySet().stream().max(Comparator.comparing(e -> e.getValue())).get().getKey();

		System.out.println(frequentCity);
		// citiesCountMap.entrySet().stream().max(Comparator::comparing(Map.Entry::getValue)).get().getKey()
		// System.out.println();



	}
}


