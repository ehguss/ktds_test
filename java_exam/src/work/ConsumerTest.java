package work;

public class ConsumerTest {

	public static void main(String[] args) {
		
		// Consumer 생성자에 
		// capital : 10_000, stuffPrize : 500, stuffWeight : 10_000, 
		// holdMaxWeight : 1_000) 멤버변수에 할당하기 위해 파라미터로 값 전달
		Consumer kimDoHyeon = new Consumer(10_000, 500, 10_000, 1_000);
		int buyCnt = 10;
//		kimDoHyeon.capital = 10_000;
//		kimDoHyeon.stuffWeight = 500;
//		kimDoHyeon.holdMaxWeight = 10_000;
//		kimDoHyeon.stuffPrize = 1_000;
		
		kimDoHyeon.buy(buyCnt);
	}

}
