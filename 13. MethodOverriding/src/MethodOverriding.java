class Animal{
	public void show() {
		System.out.println("this is animal class");
	}
}
class Dog extends Animal{
	@Override
  public void show() {
		System.out.println("This is dog class");
	}
}

class Cat extends Dog{
	@Override
	public void show() {
		System.out.println("This is cat class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Cat cat= new Cat();
		cat.show();
		
		Animal animal= new Dog(); //Dynamic Method Dispatch
		animal.show();
		
	}

}
