
public class Main {

	public static void main(String[] args) {
		
		Mobile obj1= new Mobile();
		Mobile obj2=new Mobile("Nokia");
		Mobile obj3=new Mobile("LG", 54000,"G6");
		
		System.out.println(obj1.add(2, 3));
		System.out.println(obj2.add(6, 4));
		
		System.out.println(obj1.add(2, 3,5));
		System.out.println(obj2.add(6, 4,5));

	}

}
