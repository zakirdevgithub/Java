package mainPack;
import stat.StaticInitialization;
import init.InstanceInitialization;

public class Main{
	public static void main(String[] args){
		
		InstanceInitialization obj1= new InstanceInitialization();
		obj1.show();
		StaticInitialization obj2= new StaticInitialization();
		obj2.display();
	}
}