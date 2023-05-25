package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<String> list = new ArrayList<>(); list.add("A"); list.add("B");
		 * list.add("C");
		 * 
		 * System.out.println(list.get(2));
		 * 
		 * System.out.println("****for each Iteration****"); for (String s : list) {
		 * System.out.println(s); }
		 * 
		 * System.out.println("****index Iteration****"); for (int i = 0; i <
		 * list.size(); i++) { System.out.println(list.get(i)); }
		 * 
		 * list.remove("B");
		 * 
		 * System.out.println("****Iteration after Removal****"); for (String s : list)
		 * { System.out.println(s); }
		 */
		List<String> linkList	= new LinkedList<>();
		linkList.add("kiru");
		linkList.add("Vino");
		linkList.add("sham");
		System.out.println(linkList.get(2));
		System.out.println("****Iteration****");
		for(String s1: linkList){
			System.out.println(s1);
			//linkList.add("qqq");
		}
		
	}

}
