package exam;

public class Q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 12;
		int y = 5;
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("4");
		}

	}

}
