package work;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 교안 84 ~ 87
		
//		int num = 10;
//		float fnum = num;
//		double dnum = num;
//		
//		System.out.println(num);	//10
//		System.out.println(fnum);	//10 -> 10.0
//		System.out.println(dnum);	//10 -> 10.0
		
		//85
//		float fnum = 10.9f;
//		int num = (int) fnum;
//		System.out.println(fnum);	//10.9
//		System.out.println(num);	//10
//		
//		double dnum = 11.15;
//		num = (int) dnum;
//		System.out.println(dnum);	//11.15
//		System.out.println(num);	//11
		
		//86
		//ceil = 올림 
//		double dnum = 10.1;
//		dnum = Math.ceil(dnum);
//		System.out.println(dnum);	//11.0
//		
//		//floor = 소수점 버림
//		dnum = 10.9;
//		dnum = Math.floor(dnum);
//		System.out.println(dnum);	//10.0
//		
//		//round = 소수점 반올림
//		dnum = 15.18;
//		dnum = Math.round(dnum);
//		System.err.println(dnum);	//15.1 -> 15.0
//		
//		//round = 소수점 반올림
//		dnum = 10.56;
//		dnum = Math.round(dnum);
//		System.out.println(dnum);	//10.6 -> 11.0

		// 87
		double dnum = 29.37;
		double dnum2 = dnum * 10;
		System.out.println(dnum2);	//293.7
		
		dnum2 = Math.round(dnum2);
		System.out.println(dnum2);	//294.0
		
		double dnum3 = dnum2 / 10;
		System.out.println(dnum3);	//29.4
	}

}
