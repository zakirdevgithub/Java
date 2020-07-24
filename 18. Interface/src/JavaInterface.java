/* 1.in interface class, method are public abstract default vabe
 * 2.default method declare kora jay
 * 3. duita interface e same method thakle override korar somoy
 * 	  interfaceName.super.methodName() likhte hobe
 * */

interface Boss1{
	void pythonProject(String project1, String project2, String project3);
	int calculator(int a,int b);
	default void name() {
		System.out.println("Intelligent Boss");
	}
}

interface Boss2{
	void javaProject(String project1, String project2, String project3);
	double calculator(double x, double y);
	default void name() {
		System.out.println("Android Lover");
	}
}

class Implementor implements Boss1,Boss2{
	@Override
	public void pythonProject(String project1, String project2, String project3) {
		System.out.println("1st Python project: "+project1);
		System.out.println("2nd Python project: "+project2);
		System.out.println("3rd Python project: "+project3);
	}
	
	@Override
	public int calculator(int a, int b) {
		return a+b;
	}
	
	@Override
	public void javaProject(String project1, String project2, String project3) {
		System.out.println("1st Java project: "+project1);
		System.out.println("2nd Java project: "+project2);
		System.out.println("3rd Java project: "+project3);
	}
	
	@Override
	public double calculator(double x, double y) {
		return x/y;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		Boss1.super.name();
		Boss2.super.name();
	}

}


public class JavaInterface {

	public static void main(String[] args) {
		
		Implementor obj= new Implementor();
		obj.name();
		
		double divResult=obj.calculator(10.6, 2.9);
		System.out.println(divResult);
		int addResult=obj.calculator(10, 5);
		System.out.println(addResult);
		obj.pythonProject("Django", "GUI", "Pygame");
		obj.javaProject("Media Player", "Android App", "Spring Boot");

	}

}
