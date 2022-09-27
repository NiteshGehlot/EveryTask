package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new Hashtable();

		map.put(120, "c");
		map.put(110, "e");
		map.put(140, "h");
		map.put(150, "a");
		map.put(null, "l"); // overrides value

		System.out.println(map);

	}

}
