package exam;

public class Q120830 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int k = 3;
		
		if (n >= 10) {
			k -= n / 10;
			System.out.println( n * 12000 + k * 2000);
		}
		else {
			System.out.println( n * 12000 + k * 2000);
		}
		
	}

}
