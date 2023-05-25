package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1,"A");
		treeMap.put(5, "B");
		treeMap.put(2, "C");
		treeMap.put(2, "G");
		//treeMap.put(null, "G");
		System.out.println(treeMap.keySet());
		for(Entry<Integer, String> entrySet: treeMap.entrySet()) {
			System.out.println("key : "+ entrySet.getKey()+" value : "+ entrySet.getValue());
		}

		Map<Integer, String> linkedMap = new LinkedHashMap<>();
		linkedMap.put(1, "a");
		linkedMap.put(3, "b");
		linkedMap.put(6, "p");
		linkedMap.put(null, null);
		for(Entry<Integer, String> entryMap: linkedMap.entrySet())
		{
			System.out.println("key :"+entryMap.getKey()+" val "+ entryMap.getValue());

		}
		
		for (Iterator iterator = linkedMap.keySet().iterator(); iterator.hasNext();) {
			System.out.println( linkedMap.get(iterator.next()));
			
		}
		checkDuplicate(6, linkedMap);
		checkDuplicate(2, linkedMap);
		checkDuplicate(2, treeMap);
		linkedMap.remove(6);
		System.out.println(linkedMap);
	}


	public static void checkDuplicate(Integer i,Map<Integer, String> map)
	{
		if(map.containsKey(i))
		{
			System.out.println("Duplicate "+ i);
		}
		else
		{
			System.out.println("Non Duplicate "+i );
		}
	}
}
