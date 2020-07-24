class Rakib{
	public void info(String name) {
		System.out.println("Name: "+name);
		System.out.println("This is Rakib class");
	}
}
//class Shuvo extends Rakib{
//	@Override
//	public void  info(String name) {
//		System.out.println("Name: "+name);
//	}
//}

public class AnonymousClass {

	public static void main(String[] args) {
		
		Rakib rk= new Rakib() {
			public void  info(String name) {
				System.out.println("Name: "+name);
				System.out.println("This is Shuvo class");
			}
		          };
		    rk.info("Shuvo");

	}

}
