package java_exam;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 1 부터 100 까지의 합을 구해 출력해보세요.");
		int sum = 0;
		for(int i = 1; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("2. 1 부터 100 중 홀수의 합을 구해 출력해보세요.");
		
		sum = 0; 
		for(int j = 1; j <=100; j= j +2) {
			sum += j;
		}
		System.out.println(sum);
		
		System.out.println("3. 1 부터 100 중 3, 5, 6의 배수만 출력해보세요.");
		sum = 0; 
		for(int n = 1; n <=100; n++) {
			if(n%3 == 0 && n%5 == 0 && n%6 == 0 ) {
				System.out.println(n);
			}
		}
		
		System.out.println("4. 아래 결과가 나오게 반복문을 작성해보세요.");
		
		int a = 0;
		int b = 1;
		int m = 5;
		for (a = 0; a < m; a++) {
			for (b = m-a; b < m; b++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		// a가 1일때 b도 1 a가 2일때 b는1,2
		System.out.println("5. 1~5까지 출력");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("6. 5~1까지 출력");
		
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
