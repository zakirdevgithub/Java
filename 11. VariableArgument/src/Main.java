class VariableArgument{
	public void myArray(int ...i) {
		for(int n: i) {
			System.out.println(n);
		}
	}
}
public class Main {

	public static void main(String[] args) {
		
		VariableArgument obj=new VariableArgument();
		obj.myArray(1,3,5,7,9);
	}

}
