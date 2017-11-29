package test;


import java.math.BigDecimal;

public class Test1 {

	
	//decimal shenanigans
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnObject a = new AnObject(5);
//		a.aMethod();
//		AnObject b = new AnObject(9);
//		b.aMethod();
//		System.out.println("end");
		
		
		float a = 0.1F + 0.2F;
		System.out.println(a);
		
		double a1 = 0.1;
		double a2 = 0.2;
		double c = a1 + a2;
		System.out.println(c);
		
		BigDecimal bd = new BigDecimal(0.1+0.2);
		System.out.println(bd);
		
		float d = 1 + 2;
		BigDecimal bd2 = new BigDecimal(d/10);
		System.out.println(bd2);
		
		double e = 1 + 2;
		BigDecimal bd3 = new BigDecimal(e/10);
		System.out.println(bd3);
	}

}
