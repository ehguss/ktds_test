package work;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2부터 100,000까지의 숫자 중 소수만 출력하는 프로그램을 작성해라
		
		int n = 0;
		int m = 0;
		for(n = 2; n <= 100_000; n++) {
			for(m = 2; m <= 100_000; m++) {
				if(n > m) {
					if(n % m == 0) {		// 약수가 있음 -> n 증가
						break;
					}
					// 없다면 끝까지 탐색해야함.
				}
				else if ( n == m ) {
					System.out.println(n);
				}
				else {
					break;
				}
			}
		}
	}
	

}
