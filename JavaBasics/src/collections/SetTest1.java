package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Rect");
		hashSet.add("D");
		hashSet.add("D");
		for(String s:hashSet)
		{
			System.out.println(s);
		}
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(7);
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(3);
		for (Integer i :treeSet)
		{
			System.out.println(i);
		}

		checkDuplicate(8, treeSet);
	}

	public static void checkDuplicate(Integer i,Set<Integer> set)

	{
		if (set.contains(i))
		{
			System.out.println(i+" Duplicate ");
		}
	}
}
