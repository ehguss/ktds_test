package exam;

public class Q2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 10;
		int m = 10;
		
		if(m < 45) {
			h -= 1;
			m = 60 - 45 + m;
			System.out.println(h + " " + m);
		}
		else {
			m -= 45;
			System.out.println(h + " " +  m);
		}
		
		//if-else 안쓰기
		int h2 = 10;
		int m2 = 10;
		
		m2 = h2 * 60 + m2;
		h2 = m2 / 60;
		m2 %= 60;
		
		System.out.println(h + " " +  m);
		
	}

}
