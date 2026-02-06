package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {
	
	public void printDishUseFor() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && FoodType이 MEAT인 && DishType이 Fish 인- for");
		List<Dish> dishList = DishList.makeDishList();
		for (Dish dish : dishList) {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH) {
				System.out.println(dish);
			}
		}
		
		
	}
	
	public void printDishUseStream() {
		
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && FoodType이 MEAT인 && DishType이 Fish 인- List.forEach");
		List<Dish> dishList = DishList.makeDishList();
		// forEach - Consumer<? super Dish>(FunctionalInterface - return void)를 필요로 한다.
		// Consumer<? super Dish> - 제네릭에 ? 가 있음 -> 와일드카드, dish가 올수도 있고 dish가 슈퍼클래스인 아무거나 올수도 있다.
//		dishList.forEach( dish -> System.out.println(dish)); - 칼로리 제한 없는경우
		dishList.forEach( dish -> {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH) {
				System.out.println(dish);
			}
		});	
		//메소드레퍼런스 쓰는 경우
//		dishList.forEach( System.out::println);
		
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && FoodType이 MEAT인 && DishType이 Fish 인- Stream");
		// Stream을 사용할 수 있는 대상 -> List, Set
		dishList //List<Dish> - dishList의 타입은 List이고 제네릭은 Dish이다.
				.stream()		//Stream<Dish> stream() - 직렬 스트림
//				.peek(dish -> {
//					System.out.println("첫번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("1. " +dish.getName());
//					System.out.println("1. " +dish.getCalories());
//					System.out.println("1. " +dish.getFoodType());
//					System.out.println("1. " +dish.getDishType());
//				})     //Stream<Dish> ( 현재 반복중인 인스턴스를 확인 - Debuging 용도 )
//				.filter(dish -> dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH)  // Stream<Dish>)  // Stream<Dish>
				.filter(dish -> dish.getCalories() < 500)
//				.peek(dish -> {
//					System.out.println("두번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("2. " +dish.getName());
//					System.out.println("2. " +dish.getCalories());
//					System.out.println("2. " +dish.getFoodType());
//					System.out.println("2. " +dish.getDishType());
//				})     //Stream<Dish> ( 현재 반복중인 인스턴스를 확인 - Debuging 용도 )
				.filter(dish -> dish.getFoodType() == FoodType.MEAT)  // Stream<Dish>
//				.peek(dish -> {
//					System.out.println("세번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("3. " +dish.getName());
//					System.out.println("3. " +dish.getCalories());
//					System.out.println("3. " +dish.getFoodType());
//					System.out.println("3. " +dish.getDishType());
//				})     //Stream<Dish> ( 현재 반복중인 인스턴스를 확인 - Debuging 용도 )
				.filter(dish -> dish.getDishType() == DishType.FISH)  // Stream<Dish>
//				.peek(dish -> {
//					System.out.println("네번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("4. " +dish.getName());
//					System.out.println("4. " +dish.getCalories());
//					System.out.println("4. " +dish.getFoodType());
//					System.out.println("4. " +dish.getDishType());
//				})     //Stream<Dish> ( 현재 반복중인 인스턴스를 확인 - Debuging 용도 )
				.forEach(dish -> System.out.println(dish));   // filter안에서 && 연산자를 사용하여 조건을 한번에 걸수도 있지만 따로 작성도 가능
		// forEach 가 반복을 하는것이 아닌 stream이 반복시키는 것으로 stream()이후로 반복이 된다.
		// filter 한 결과 (dish가 맞는지)가 true면 그 다음 진행 - forEach문 실행(출력해라)
		// false면 아무것도 출력이 되지 않는다.
		

// 메소드 레퍼런스	.forEach( System.out::println);
	}
	
	public void printEvenNumbers() {
		
		List<Integer> numbers = Arrays.asList(1,23,3,123,45667,234234,1,3,8,3,0,33423,234);
		
		// 1. numbers에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream()
			   .map(number -> number * 2)
			   .forEach(System.out::println);
		System.out.println("=".repeat(40));
		// 2. numbers에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream()
		       .distinct()
		       .map(number -> number * 2)
		       .forEach(System.out::println);
	
	}
	
	
	public String makeString() {
		// 모든 VEGETABLES 메뉴의 이름들을 ","로 연결한 문자열을 반환한다.
		
		List<Dish> dishList = DishList.makeDishList();
		
		String dishesName = dishList.stream()  //Stream<Dish>
									.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)		//Stream<Dish>
									.map(Dish::getName)		// Stream<String>
									.collect( Collectors.joining(", ") );			// 최종함수
		return dishesName;
	}
	
	// 수정 불가능한(add, delete, 등) 리스트 만들기result
	public List<Dish> getHealthyDishes(){
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
								  .filter(dish -> dish.getCalories() < 400)
								  .toList();  		// 변경 불가능한 리스트
		// 변경불가능한 리스트(add불가)
		return result;
	}
	
	// 수정 가능한(add, delete, 등) 리스트 만들기result
	public List<Dish> getHealthyDishes2(){
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
								  .filter(dish -> dish.getCalories() < 400)
								  .collect(Collectors.toList());		// 변경 가능한 리스트 생성
		// 변경불가능한 리스트(add불가)
		return result;
	}
	
	
	public static void main(String[] args) {
		StreamBasic basic = new StreamBasic();
		basic.printDishUseFor();
		basic.printDishUseStream();
		basic.printEvenNumbers();
		
		String dishesName = basic.makeString();
		System.out.println(dishesName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
		// 수정불가능한 리스트임
//		result.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));  //Exception in thread "main" java.lang.UnsupportedOperationException
		
		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		// 수정가능한 리스트
		result2.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));  
	}
}
