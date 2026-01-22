package work;

public class SellerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Seller 생성자에 모든 상품의 금액인 (stuffPrize : 1000, stock: 10)으로 세팅
		// 객체 생성
		Seller kimDoHyeon = new Seller(1_000, 10);
//		kimDoHyeon.stuffPrize = 1_000;
//		kimDoHyeon.stock = 10;
		
		int consumerbuyCnt = 5;
		kimDoHyeon.capital = kimDoHyeon.sell(consumerbuyCnt);
		
		System.out.println("재고 수 : " + kimDoHyeon.stock + " 자본금 : " + kimDoHyeon.capital);
	}

}
