package exam;

public class Q2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h = 14;
		int m = 30;
		
		int cookTime = 1440;
		
		// 요리시간이 하루가 넘어간다면
		
		if(m + cookTime >= 60) {
			h += 1;
			m = m + cookTime - 60;
			System.out.println(h + " " + m);
		}
		else {
			m = m + cookTime;
			System.out.println(h + " " + m);
		}
		
		//if - else 문 사용하지 않기
		int h2 = 14;
		int m2 = 30;
		m2 += h2 * 60 + cookTime;
		h2 = m2 / 60;
		m2 %= 60;
		System.out.println(h2 + " " + m2);
	}

}
