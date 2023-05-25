package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		System.out.println("****HashMap******");
		insertValue(new HashMap<String, Integer>());
		System.out.println("****LinkedHashMap******");
		insertValue(new LinkedHashMap<String, Integer>());
		System.out.println("****TreeMap******");
		insertValue(new TreeMap<String, Integer>());
		
	}

	private static void insertValue(Map<String, Integer> map) {
		map.put("B", 1);
		map.put("C", 3);
		map.put("A", 1);
		map.put("C", 2);
		System.out.println(" put return type "+map.put("B", 22));
		map.put("H", null);
		
		Map<String, List<Integer>> newMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("Key : "+ key+", Value : "+ val);
			if(newMap.containsKey(entry.getKey())) {
				List<Integer> list = newMap.get(entry.getKey());
				list.add(entry.getValue());
				newMap.put(entry.getKey(),list );
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(entry.getValue());
				newMap.put(entry.getKey(), list);
			}
		}
		
		System.out.println(newMap);
		
		
		
	}

}
