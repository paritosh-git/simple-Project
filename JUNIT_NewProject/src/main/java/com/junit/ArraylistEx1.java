package com.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraylistEx1 {
	public static ArrayList<Integer> addData() {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Paritosh");
		al.add("Paritosh1");
		al.add("Paritosh2");
		al.add("Paritosh2");
		al.add("Paritosh1");
		al.add("Paritosh1");
		al.add("Paritosh3");

		HashSet<String> hs = new HashSet<String>(al);
		
		
		ArrayList<Integer> key = new ArrayList<Integer>();
		
		// System.out.println(hs);

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String ele : hs) {
			int uu = Collections.frequency(al, ele);
			System.out.println(uu);
			hm.put(ele, uu);

		}
		Set<String> list = hm.keySet();
		for (String value : list) {
			int val1 = hm.get(value);
			key.add(val1);
		}
		System.out.println(hm);
		return key;

	}

}
