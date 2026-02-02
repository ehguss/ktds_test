package com.ktdsuniversity.edu.generics.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("김도현1");
		names.add("김도현2");
		names.add("김도현3");
		names.add("김도현4");
		names.add("김도현5");
		
		System.out.println(names);
		String name = null;
		for (int i = 0; i<names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		
		int[] arr = new int[] {1,2,3};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		for (int value : arr) {
			System.out.println(value);
		}
		
		String[] names2 = new String[] {"A", "B", "C"};
		/*
		 * 1.A
		 * 2.B
		 * 3.C
		 */
		
		
	}
	
	
}
