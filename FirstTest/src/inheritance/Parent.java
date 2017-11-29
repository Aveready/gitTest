package inheritance;

public class Parent {
	protected int age;
	protected String name;
	public Parent(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Parent initialised");
	}
	
	public void show() {
		System.out.println(age + ", " + name);
	}
}
