package work;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer kimDoHyeon = new Consumer();
		int buyCnt = 10;
		kimDoHyeon.capital = 10_000;
		kimDoHyeon.stuffWeight = 500;
		kimDoHyeon.holdMaxWeight = 10_000;
		kimDoHyeon.stuffPrize = 1_000;
		
		kimDoHyeon.buy(buyCnt);
	}

}
