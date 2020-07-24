
public class Mobile {
	private String brandName;
	private int price;
	private String model;
	
	// constructor overloading
	public Mobile() 
	{
		System.out.println("I am default constructor");
	}
	
	public Mobile(String brandName) 
	{   
		this.brandName=brandName;
	}
	
	public Mobile(String brandName, int price, String model) {
		this.brandName= brandName;
		this.price=price;
		this.model=model;
	}
	
	//Method Overloading
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}

}
