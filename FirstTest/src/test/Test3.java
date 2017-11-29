package test;



public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(System.currentTimeMillis());
	    double a = 1;
	    for(int i = 0; i < 10000000; i++) {
//	    	a++;
	    	a = a/2 * Math.random();
	    }
	    System.out.println(System.currentTimeMillis());
	}

}
