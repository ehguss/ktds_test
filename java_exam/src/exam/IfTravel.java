package exam;

public class IfTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;

		int fatherFee = 0;
		int motherFee = 0;
		int daughterFee = 0;
		if(daughter >= 19) {
			daughterFee = adultOneWayFlightFare;
		}
		else{
			daughterFee = kidOneWayFlightFare;
		}
		
		if(father >= 19) {
			fatherFee = adultOneWayFlightFare;
		}
		else{
			fatherFee = kidOneWayFlightFare;
		}
		if(mother >= 19) {
			motherFee = adultOneWayFlightFare;
		}
		else{
			motherFee = kidOneWayFlightFare;
		}
		

		int sum = fatherFee + motherFee + daughterFee;
		
		if (sum > money) {
			System.out.println("다음에가자");
		}
		else {
			System.out.println("여행가자!");
		}
		
		
		// case3. 비행요금. 케이스 계산 X
		//        삼항 연산. ==> if ~ else 대체. (권장하지 않음 - 성능이 다소 느림)
		
		sum = father >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		sum += mother >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		sum += daughter >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		
		if (sum > money) {
			System.out.println("다음에가자");
		}
		else {
			System.out.println("여행가자!");
		}
		
	}

}
