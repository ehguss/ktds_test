package exam;

public class Q2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 6;
		int second = 2;
		int third = 5;
		
		int prize = 0;
		
		// 같은 눈이 3개 나오는 경우
		if (first == second && second == third){
			prize = 10_000 + first * 1_000;
		}
		// 같은 눈이 2개 나오는 경우
		else if(first == second && (first != third || second != third)){
			prize = 1_000 + first * 100;
		}
		// 같은 눈이 2개 나오는 경우
		else if(first == third && (first != second || second != third)){
			prize = 1_000 + first * 100;
		}
		// 같은 눈이 2개 나오는 경우
		else if(third == second && (first != third || second != first)){
			prize = 1_000 + third * 100;
		}
		// 모두 다른 눈이 나오는 경우
		else{
			if(first > second && first > third){
				prize = first * 100;
			}
			else if(second > first && second > third){
				prize = second * 100;
			}
			else{
				prize = third * 100;
			}
		}
		
		System.out.println(prize);
		
		
	}

}
