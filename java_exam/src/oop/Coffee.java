package oop;

/**
 * <pre>
 * 데이터 클래스
 * 커피메뉴를 나타낸다
 * </pre>
 */
public class Coffee {
	
	/**
	 * 커피 메뉴의 이름
	 */
	String name;
	
	/**
	 * 커피메뉴의 가겨
	 */
	int price;
	
	/**
	 * 생성자 - 파라미터가 있으므로 기본생성자 생성 x
	 */
	public Coffee(String name, int price) {
		// 생성자의 this는 생성자에서 말하는 인스턴스
		this.name = name;
		this.price = price;
	}
}
