/* if (not static class){
 *  OuterClass.InnerClass innerObj= outerObj.new InnerClass();
 * }
 * if(static class){
 *  OuterClass.InnerClass innerObj= new OuterClass.InnerClass();
 * }
 *  
 * */
class Animal{
	public String name;
	public int age;
	public void info() {
		System.out.println("Name: "+name+" Age: "+age);
	}
	
	class Dog{
		public void doggy() {
			System.out.println("Name: "+name+" Age: "+age);
		}
		
		class BigDog{
			public void bigDog() {
				System.out.println("This is Big Dog Class");
			}
		}
//		static class SmallDog {
//			
//		}
	}
	static class Cat{
		public void catty(String name, int age) {
			System.out.println("Name: "+name+" Age: "+age);
		}
		
		class BigCat{
			public void bigCat() {
				System.out.println("This is from Big cat Class");
			}
		}
		static class SmallCat{
			public void smallCat() {
				System.out.println("This is from Small Cat Class");
			}
		}
		
	}
}




public class Main {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.name="Tom";
		animal.age=3;
		animal.info();
		Animal.Dog dog=animal.new Dog();
		dog.doggy();
		
		Animal.Cat cat= new Animal.Cat();
		cat.catty("Jerry", 2);
		
		Animal.Dog.BigDog bdog=dog.new BigDog();
		bdog.bigDog();
		
		Animal.Cat.SmallCat scat= new Animal.Cat.SmallCat();
		scat.smallCat();
		
		Animal.Cat.BigCat bcat=cat.new BigCat();
		bcat.bigCat();
		
		
	}

}
