
public class Dog extends Animal{
	
	private String color;
	
	public Dog(String name, int age, double weight, String color){
		super(name,age,weight);
		this.color=color;
	}
	public Dog(String name) {
		this(name,5,30.0,"Black");
	}
	
	public String getColor() {
		return this.color;
	}
}
