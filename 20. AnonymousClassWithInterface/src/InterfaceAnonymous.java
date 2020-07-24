interface Animal{
	void display();
}

//class implementor implements Animal{
//	@Override
//	public void display() {
//		System.out.println("This is implementor class");
//	}
//}

public class InterfaceAnonymous {

	public static void main(String[] args) {
		
		Animal animal=new Animal() {
			          public void display() {
				          System.out.println("This is implementor class");
			              }};
			    animal.display();

	}

}
