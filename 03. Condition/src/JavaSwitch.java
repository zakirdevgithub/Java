
public class JavaSwitch {
	
	// creating method
	public void gradeCalculate() {
		int mark=100;
		switch(mark) {
		case 33:
			System.out.println("you are passed");
			break;
		case 40:
			System.out.println("C");
			break;
		case 50:
			System.out.println("B");
			break;
		case 60:
			System.out.println("A-");
			break;
		case 70:
			System.out.println("A");
		case 80: case 90: case 100:
			System.out.println("A+");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
