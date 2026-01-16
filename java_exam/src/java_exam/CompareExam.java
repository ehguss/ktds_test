package java_exam;

public class CompareExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		
		// age가 10대 인지 확인해본다.
		// 10 <= age < 20
		if (10 <= age && age <20) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		boolean isTeenager = 10 <= age && age < 20;
		System.out.println(isTeenager);
		
		// 10대가 맞다면 true를 아니라면 false를 출력한다.
		
		
		// age가 20대 인지 확인해본다.
		// 20 <= age < 30
		
		// 20대가 맞다면 true를 아니라면 false를 출력한다.
		if (20 <= age && age <30) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		boolean isTwenty= 20 <= age && age < 30;
		System.out.println(isTwenty);
		
		
		// A 가게는 19세 이상의 고객만 방문할 수 있다.
		// A 가게에서 판매하는 모든 제품의 가격은 1500원이다.
		// 고객은 가게에서 제품을 구매할 수 있을까?
		// 구매할수 있다면 True, 아니라면 False를 출력한다.
		// 빠른 연산 고려
		
		
		// 가게에 방문한 고객의 나이
		int customerAge = 15;
		// 고객의 지갑에 들어있는 돈
		int customerWallet = 3000;
		
		boolean isCustomer = 19 <= customerAge && 1500 <= customerWallet;
		System.out.println(isCustomer);
		
		
		// B 가게는 19세 이상의 고객만 방문할 수 있다.
		// B 가게에서 판매하는 모든 제품의 가격은 2000원이다.
		// B 가게는 특별이벤트로 고객의 나이가 3의 배수이면 돈이 모자라더라도 구매할 수 있게 하고 있다,
		// 고객은 가게에서 제품을 구매할 수 있을까?
		// 구매할수 있다면 True, 아니라면 False를 출력한다.
		// 빠른 연산 고려
		
		customerAge = 15;
		customerWallet = 1300;
		
		// 방법1 ( 3줄 ) 
		isCustomer = 19 <= customerAge && 2000 <= customerWallet;
		boolean isSpecialCustomer = 19 <= customerAge && customerAge % 3 == 0;
		boolean isFinalCustomer = isCustomer || isSpecialCustomer;
		System.out.println(isFinalCustomer);
		
		// 방법2 ( 1줄 )
		isCustomer = 19 <= customerAge && (2000 <= customerWallet || customerAge % 3 == 0);
		System.out.println(isCustomer);
		
		// 방법3 ( 2줄 )
		boolean isAdult = customerAge >= 19;
		isCustomer = customerWallet >= 2000 || customerAge % 3 == 0;
		
		System.out.println(isAdult && isCustomer);
		
		
		
		
		

	}

}
