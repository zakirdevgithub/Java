abstract class AbstractClass{
	public abstract void info();
	public abstract int add(int a, int b);
	public abstract double divide( double x, double y);
	public  String Friends(String friend1, String friend2) {
		String friends=friend1+" "+friend2;
		return friends;
	}
}

class NormalClass extends AbstractClass{
	
	@Override
	public void info() {
		System.out.println("This is from Normal class");
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public double divide(double x, double y) {
		return x/y;
	}
}




public class JavaAbstract {
	public static void main(String [] args ) {
		
		NormalClass normal= new NormalClass();
		normal.info();
		System.out.println(normal.add(5,6));
		
		System.out.println(normal.divide(11, 4));
		System.out.println(normal.Friends("Shovon", "Tushar"));
		
	}
}
