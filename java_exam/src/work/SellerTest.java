package work;

public class SellerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seller kimDoHyeon = new Seller();
		kimDoHyeon.stuffPrize = 1_000;
		kimDoHyeon.stock = 10;
		
		int consumerbuyCnt = 5;
		kimDoHyeon.capital = kimDoHyeon.sell(consumerbuyCnt);
		
		System.out.println("재고 수 : " + kimDoHyeon.stock + " 자본금 : " + kimDoHyeon.capital);
	}

}
