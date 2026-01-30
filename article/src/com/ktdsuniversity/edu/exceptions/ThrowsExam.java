package com.ktdsuniversity.edu.exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.ktdsuniversity.edu.homework.restaurant.Guest;

public class ThrowsExam {

	/**
	 * createNewInstance("com.ktdsuniversity.edu.homework.restaurant.Guest")
	 * ==> Customer의 인스턴스가 반환(reflection)
	 * @param classPath
	 * @return
	 */
	public static Object createNewInstance(String classPath) {
	
		Class clazz = null;
		try {
			clazz = Class.forName(classPath);	
		} catch (ClassNotFoundException cnfe) {
			System.out.println(classPath + ": 존재하지 않는 클래스입니다.");
		}
		if(clazz != null) {
			Constructor constructor = null;
			try {
				//예외가 발생하지 않았다면 String.class, int.class 이런 타입을 가진 생성자를 가지고 와라
					constructor = clazz.getConstructor(String.class, int.class, double.class, int.class);
			
			} catch (NoSuchMethodException e) {
				System.out.println("생성자를 찾을 수 없습니다.");
			}
			
			if(constructor != null) {
				//생성자를 올바르게 찾아왔다면 newInstance(생성자를 호출하는 메소드)를 통해서 생성자를 호출해라 
				//호출된 생성자를 object 에 해당하는 instance 변수에 넣어라
				try {
					Object instance = constructor.newInstance("리플렉션", 100, 10.0, 10);
					return instance;
				} catch (InstantiationException e) {
					System.out.println("인스턴스 생성을 실패했습니다.");
				} catch (IllegalAccessException e) {
					System.out.println("접근 권한이 없습니다.");
				} catch (IllegalArgumentException e) {
					System.out.println("생성 파라미터가 잘못되었습니다.");
				} catch (InvocationTargetException e) {
					System.out.println("생성자를 실행할 때 에러가 발생했습니다.");
				}
			}
			
		}
		return null;
		
	}
	public static void main(String[] args) {
		
		Guest cust = (Guest)createNewInstance("com.ktdsuniversity.edu.homework.restaurant.Guest");
		System.out.println(cust);
	}
}
