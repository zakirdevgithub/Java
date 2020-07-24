interface Person{
	void show();
	static void name(String name) //static method of interface
	{  
		System.out.println("Name: "+name);
	}
}
//class Implementor implements Person{
//	@Override
//	public void show() {
//		System.out.println("My name is Zakir Hossain");
//	}
//}



public class LambdaFunction {

	public static void main(String[] args) {
		
		Person.name("Jewel");
		
		Person obj= () -> {System.out.println("My name is Zakir Hossain");};
		
		obj.show();
	}

}
