package inheritance;

public class InhTest {
	public static void main(String[] args) {
		Child c = new Child(12, "ed", "Some school");
		c.show();
		
		Parent p = new Child(24, "abcd", "somewhere");
		p.show();
		Parent p2 = new Parent(69, "Tan");
		p2.show();
		Child c2;
		Child c3;
		if(p instanceof Child) {
			c2 = (Child) p;
			c2.show();
		}
		else {
			System.out.println("p is not a child");
		}
		
		if(p2 instanceof Child) {
			c3 = (Child) p2;
			c3.show();
		}
		else {
			System.out.println("p2 is not a child");
		}
	}
}
