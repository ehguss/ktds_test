package com.ktdsuniversity.edu.generics.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

	public static void printStudents(Map<Integer, List<Student>> classes, int classNum) {
		
		List<Student> students = classes.get(classNum);
		
		if(students != null) {
			
			for(Student student : students) {
				System.out.println(classNum + "반의 학생: " + student);
			}
			
		}
	}
	public static void main(String[] args) {
		
		Map<Integer, List<Student>> classes = new HashMap<>();
		
		classes.put(1, new ArrayList<>());
		classes.put(2, new ArrayList<>());
		
		List<Student> students = classes.get(1);
		students.add( new Student(1, "김범수"));
		students.add( new Student(2, "나얼"));
		students.add( new Student(3, "박효신"));
		students.add( new Student(4, "이수"));
		
		printStudents(classes, 0);
		printStudents(classes, 1);
		printStudents(classes, 2);
		printStudents(classes, 3);
		
		System.out.println(classes);
		System.out.println(classes.size());
		
		//map은 반복이 안됨. -> 다른 방법 사용해야함. (그러나 잘 사용하지 않는다.)
		for(Integer key:classes.keySet()) {
			System.out.println(classes.get(key));
		}
	}
}
