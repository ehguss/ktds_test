package exam;

public class Q120829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int angle = 70;
		
		if(angle > 0 && angle < 90) {
			System.out.println("예각");
		}
		else if(angle > 90 && angle < 180) {
			System.out.println("둔각");
		}
		else{
			System.out.println("직각");
		}
	}

}
