package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(120, "a");
		map.put(110, "Snehal");
		map.put(140, "b");
		map.put(150, "c");
		map.put(150, "d");           //overrides value
		
		
		System.out.println(map);
		System.out.println(map.keySet());   //print all keys
		System.out.println(map.values());   //print all values
		System.out.println(map.get(120));   //gives value of the key
		
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet) {
			System.out.println(key+" "+map.get(key));
		}
		
		
		
		

	}

}
