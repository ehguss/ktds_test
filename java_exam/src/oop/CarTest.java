package oop;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		기본값 할당x
//		boolean i;
//		System.out.println(i);
		
		//Car - 클래스명 앞/뒤가 똑같이 만든는데 뒤에만 소괄호를 쓴다.
		Car kona = new Car("KONA");
		System.out.println(kona);		//oop.Car@7e9e5f8a
		kona.pressEngineStartButton(); 	//코나의 시동을 건다.
		kona.pressGasolinPedal(20); 	//30
		// kona의 엔진 상태를 출력한다.
		boolean konaEngineState = kona.isEngineStart;
		System.out.println("Kona Engine : " + konaEngineState);
		
		// kona의 현재 속도를 출력한다.
		int konaSpeed = kona.speed;
		System.out.println("Kona Speed : " + konaSpeed);
		
		
		// 클래스를 인스턴스로 생성한다.
		// 인스턴스를 만들어 Car 타입의 carnival 변수에 할당한다.
		Car carnival = new Car("CARNIVAL");
		System.out.println(carnival);	//oop.Car@8bcc55f
		
		carnival.pressGasolinPedal(200);
		carnival.pressEngineStartButton();
		carnival.pressBreakPedal(10);
		carnival.pressBreakPedal(10);
		
		
		boolean carnivalEngineState = carnival.isEngineStart;
		System.out.println("Carnival Engine : " + carnivalEngineState);
		
		int carnivalSpeed = carnival.speed;
		System.out.println("Carnival Speed : " + carnivalSpeed);
		
		
	}

}
