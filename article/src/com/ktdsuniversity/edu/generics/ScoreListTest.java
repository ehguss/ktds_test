package com.ktdsuniversity.edu.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

//import java.util.Arrays;

public class ScoreListTest {

	public static void main(String[] args) {
		
		ScoreList<Integer, Integer> list = new ScoreList();
		list.add(1);
//		list.add(134.1232);		//오류
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		Reducer<Integer, Integer> listReducer = new Reducer<>() {
			@Override
			public Integer reduce(Integer input, Integer output) {
				int sum = input + output;
				return sum;
			}
		};
		
		int sum = list.sum(listReducer, 0);
		
		int funcSum = list.sum((input, output) -> input + output, 0);
		System.out.println(sum);
		
		int value = list.get(3);
		System.out.println(value);
		
		ScoreList<String, String> strList = new ScoreList<>();
		strList.add("asdfsadf");
		strList.add("asdfsadf");
		
		String concat = "";
		for(int i = 0; i < 2; i++) {
			concat += strList.get(i);
		}
		System.out.println(concat);
		
		String strValue = strList.get(0);
		System.out.println(strValue);
		
		ScoreList<String[], String> arrayList = new ScoreList<>();
		arrayList.add(new String[] {"asdf", "ASDF"});
		arrayList.add(new String[] {"asdf", "ASDF"});
		
//		String[] arrayValue = arrayList.get(1);
//		System.out.println(Arrays.toString(arrayValue));
		
//		String arrayConcat = "";
//		for(int i = 0; i < 2; i++) {
//			arrayConcat += Arrays.toString(arrayList.get(i));
//		}
//		System.out.println(arrayConcat);
		
		Reducer<String[], String> arrayReducer = new Reducer<>() {
			
			@Override
			public String reduce(String[] input, String output) {
				for (int i = 0; i < input.length; i++) {
					output += input[i];
				}
				return output;
			}
		};
		
		String arrayResult = arrayList.sum(arrayReducer, "");
		System.out.println(arrayResult);
	}
}
