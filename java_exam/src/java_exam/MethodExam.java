package java_exam;

public class MethodExam {

	public static int computeAdd(int number1, int number2) {
		int computeResult = number1 + number2;
		return computeResult;
	}
	public static void printMyName(String name) {
		System.out.println("제 이름은 "+ name + " 입니다.");
		
		if(name.length() < 3) {
			return;
			// name.length() 가 3보다 작으면 즉시 printMyName(String name) 이 메소드를 종료시킨다.
		}
		System.out.println("제 이름은 "+ name.length() + " 입니다.");
	}
	// 프로그램이 실행될 수 있는 메소드를 생성한다.
	public static void main(String[] args) {
		//이름은 main이고 반환하지 않는 메소드 - void 를 실행한다. 
		
		int resultAdd = computeAdd(19, 21);
		System.out.println(resultAdd);
//		System.out.println("제 이름은 김도현 입니다.");
//		System.out.println("제 이름은 땡땡땡 입니다.");
//		System.out.println("제 이름은 000 입니다.");
		
		String name = "김도현";
		String name2 = "땡땡땡";
		String name3 = "000";
		
		
		printMyName(name);
		printMyName(name2);
		printMyName(name3);
		
		printMyName("김도현");
		printMyName("땡땡땡");
		printMyName("000");
		
	}
}
