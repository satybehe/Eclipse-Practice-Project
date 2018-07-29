package practice2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class ExceptionDemo {
public static void main(String[] args) {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	hm.put("one", 1);
	hm.put("two", 2);
	hm.put("three",3);
	hm.put("four", 4);
	Set<String> set = hm.keySet();
	ArrayList<String> key = new ArrayList<String>(set);
	for (String s:key) {
		System.out.println(s);
	}
	System.out.println("---------------------");
	Collection<Integer> cl =hm.values();
	ArrayList<Integer> values = new ArrayList<Integer>(cl);
	
	for (Integer s:values) {
		System.out.println(s);
	}
	Set<Entry<String, Integer>> entry=hm.entrySet();
	for (Entry<String, Integer> entry1: entry) {
		System.out.println("Key: "+entry1.getKey()+"  "+"value: "+entry1.getValue());
	}
}
}