
public class Student {
	private String name;
	private int roll;
	private double height;
	
	public Student() {
		System.out.println("I am Default Constructor");
	}
	public Student(String name, int roll) {
		this.name=name;
		this.roll=roll;
		
	}
	
	public String getName() {
		return this.name;
	}
	public int getRoll() {
		return this.roll;
	}
	
	public Student(String name, int roll, double height) {
		this.name=name;
		this.roll=roll;
		this.height=height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	

}
