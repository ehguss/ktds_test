package java_exam;

public class ArithmaticOperator {
//산술연산자
	public static void main(String[] args) {
		
		int n = 0;
		
		System.out.println(n);
		n++;  // n = n+1;, n +=1;
		System.out.println(n);
		
		System.out.println(n++);	// n++ 후위연산자 이므로 n = 1이 출력된 다음 +1 이 된다.
		System.out.println(n +=1);	// n이 13행에서 2가 된다음  +=1 을 하여 3 출력
		
		
		n = 0;
		System.out.println(n);
		n--;	// n = n - 1;, n -=1;
		System.out.println(n);
		System.out.println(--n);	// --n 전위연산자이므로 n에 이미 -1을 적용한 상태에서 출력
		System.out.println(n += 2);
		
		int m = 10;
		System.out.println(++m);	//11
		System.out.println(m++);	//11
		System.out.println(m);		//12
		
		System.out.println(--m);	//11
		System.out.println(m--);	//11
		System.out.println(m);		//10
	}
}
