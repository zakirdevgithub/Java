
public class Main {

	public static void main(String[] args) {
		
		Animal animal=new Animal("Tom",4,5.6);
		System.out.println(animal.getName());
		
		Dog dog=new Dog("jerry");
		System.out.println(dog.getAge());
		
		Cat cat=new Cat("Tomas","White");
		System.out.println(cat.getColor());

	}

}
