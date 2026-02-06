package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CityTest {

	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
		
		cities.forEach(System.out::println);
		
		// stateId가 3907번인 City의 CountryName을 출력.

		  
		  
		for (City city : cities) {
			if(city.getStateId() == 3907) {
				System.out.println(city.getCountryName());
			}
		}
		
		// ==> Stream Code로 구현.
		cities.stream()
			  .filter(city -> city.getStateId() == 3907)
//			  .map(city -> city.getCountryName())   // Stream<String> 반환시키는 값의 타입이 R(countryName type - String)로 결정되는 것 
//			   T - city, R(제네릭 타입) - string <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//			  .forEach(countryName -> System.out.println(countryName));
			  .map(City::getCountryName)// 메소드레퍼런스
			  .distinct()//Stream<String> - 기존 타입 그대로 유지 Stream<T> distinct();
			  .forEach(System.out::println);
			
		
		// countryName이 "South Korea"인 City의 _native를 출력.
		
//		for (City city : cities) {
//			if(city.getCountryName().equals("South Korea")) {
//				System.out.println(city.get_native());
//			}
//		}
		
		cities.stream()
		  	  .filter(city -> city.getCountryName().equals("South Korea"))
		  	  .forEach(city -> System.out.println(city.getCountryName()));
	
		// countryName이 "South Korea"인 _native의 길이가 3이상인 City의 _native를 출력.
//		for (City city : cities) {
//			if(city.getCountryName().equals("South Korea") && city.get_native().length() >= 3) {
//				System.out.println(city.get_native());
//			}
//		}
		
		System.out.println("=".repeat(40));
		cities.stream()
		  	  .filter(city -> city.getCountryName().equals("South Korea") && city.get_native().length() >= 3)
		  	  .skip(3)    		// 전체 결과에서 3개 스킵하겠다
		  	  .limit(3)			// 스킵한 부분에서 3개만 보여줘라
		  	  .forEach(city -> System.out.println(city.get_native()));  	// 기장군, 해운대구, 사하구
		
		// _native의 값이 한글로만 이루어진 값 중에서 _native의 길이가 4글자 이상인 것의 
		// name을 중복없이 조회한다.
		
		// 예시 > 한글로만 이루어져 있는가?
		String name = "김도현";
		// name.matches("^[가-힣]${4,}") - 한글로 시작해서 한글로 끝나는데 그것이 4글자 이상이냐?
		System.out.println(name + "은 한글로만 이루어져 있다? " + name.matches("^[가-힣]{4,}$"));
		cities.stream()
			  .filter(city -> city.get_native().matches("^[가-힣]{4,}$")) //Stream<City>
			  .map(city -> city.getName()) // Stream<String> type을 바꾼다.
			  .distinct()
//			  .map(String::length)	// Stream<Integer>
//			  .filter(length -> length >= 10)
//			  .forEach(city -> System.out.println(city.length()));
			  .forEach(System.out::println);
		
		System.out.println("애월읍의 도시명을 출력한다.");
		// 애월읍의 도시명을 출력한다.
		Optional<City> found = cities.stream()			// Stream<City>
								    .filter(city -> city.getName().equals("Gaigeturi"))   // Stream<City>
								    .findFirst(); 		// Optional<City>
		System.out.println(found);  //Optional[com.ktdsuniversity.edu.fp.basic.stream.advanced.City@6305a55]
		
		Optional<City> found2 = cities.stream()			// Stream<City>
			    					  .filter(city -> city.getName().equals("wiehrjsdfjdflkj"))   // Stream<City>
			    					  .findFirst(); 		// Optional<City>
//		System.out.println(found2.orElse(null).getStateName());  //Optional.empty
//		Optional을 사용하는 Case1
		City city = found2.orElse(null);
		if(city != null) {
			System.out.println(city.getStateName());
		}
		
//		Optional을 사용하는 Case2		
		if(found2.isPresent()) {   		// 값이 있으면 optionalEmpty가 아니라면
			System.out.println(found2.get().getStateName());
		}
		
//		Optional을 사용하는 Case3
		City city2 = found2.orElse(new City(""));		// 생성자에 아무것도 안주겠다
		System.out.println(city2.getStateName());
		
		cities.stream()
			  .peek(_city -> System.out.println(_city.getCountryCode()))
			  .filter(_city -> true)
			  .map(_city -> _city.get_native());
			  
		System.out.println("~~~~~~");
	}
}
