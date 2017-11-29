package inheritance;

public class Child extends Parent{
	private String school;

	public Child(int age, String name, String school) {
		super(age, name);
		this.school = school;
		System.out.println("Child initialised");
	}
	
	public void show() {
		System.out.println(age + " " + name + " " + school);
	}
}
