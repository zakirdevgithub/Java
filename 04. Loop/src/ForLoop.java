
public class ForLoop {
	
	//creating Method
	public void makePattern1() {
		
		for(int i=1; i<=6; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void makePattern2() {
		
		for(int i=1; i<=6; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void makeBox() {
		System.out.println("Making Box");
		for(int i=6; i>=1; i--) {
			for(int j=1; j<=6; j++) {
				if((i<6 && i>1) && (j<6 && j>1)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
