
public class Main {

	public static void main(String[] args) {
		//Break
		System.out.println("Break");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i==5)
				break;
		}
		System.out.println("\nContinue");
		//Continue
		for(int i=1; i<=10; i++) {
			
			if(i==5)
				continue;
			System.out.println(i);
		}
	}

}
