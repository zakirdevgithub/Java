class Person{
	public String name;
	public int age;
	public static String country;
	public static double height;
	
	static {
	    height=6.7;
	}
	
	public void show() {
		System.out.println("Name: "+name+" Age: "+age+" Country: "+country+" height: "+height);
	}
}



public class Main {

	public static void main(String[] args) {
		
		Person zakir=new Person();
		zakir.name="Zakir hossain";
		zakir.age=25;
		Person.country="Bangladesh"; // when load class
		
		Person shovon=new Person();
		shovon.name="Jahirul Islam Shovon";
		shovon.age=30;
		shovon.country="India";
		zakir.show();
		shovon.show();
		
	}

}
