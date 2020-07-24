
public class TypeCasting {
	
	//creating a method
	public void typeCasting() {
		//int to float
		int myInt=10;
		float intToFloat=(float)myInt; // float intToFloat=myInt;   also correct
		System.out.println("Integer to Float: "+intToFloat);
		
		//int to double
		double intToDouble=(double)myInt; // double intToDouble=myInt; also correct
		System.out.println("Integer to Double: "+intToDouble);
		
		//int to byte
		byte intToByte=(byte)myInt;
		System.out.println("Integer to Byte: "+intToByte);
		
		//int to short
		short intToShort=(short)myInt;
		System.out.println("Integer to Short: "+intToShort);
		
		//char to int
		char myChar='9';
		int charToInt=Integer.parseInt(String.valueOf(myChar));
		System.out.println("Character to Integer: "+charToInt);
		
		//char to double
		double charToDouble= Double.parseDouble(String.valueOf(myChar));
		System.out.println("Character to Double: "+charToDouble);
		
		//char to float
		float charToFloat= Float.parseFloat(String.valueOf(myChar));
		System.out.println("Char to Flaot: "+charToFloat);
		
		//char to byte
		byte charToByte= Byte.parseByte(String.valueOf(myChar));
		System.out.println("Char to Byte: "+charToByte);
		
		//char to short
		short charToShort= Short.parseShort(String.valueOf(myChar));
		System.out.println("Char to Short: "+charToShort);
		
		//char to string
		String charToString= Character.toString(myChar);
		System.out.println("Char to String: "+charToString);
		
		// String to int
		String num="120";
		int stringToInt=Integer.parseInt(num);
		System.out.println("String to Integer: "+stringToInt);
		
		//String to byte
		byte stringToByte=Byte.parseByte(num);
		System.out.println("String to Byte: "+stringToByte);
		
		//String to short
		short stringToShort= Short.parseShort(num);
		System.out.println("String to Short: "+stringToShort);
		
		//String to float
		float stringToFloat= Float.parseFloat(num);
		System.out.println("String to Float: "+stringToFloat);
		
		//String to Long
		long stringToLong= Long.parseLong(num);
		System.out.println("String to Long: "+stringToLong);
		
		//int to String
		int number=23;
		String intToString=Integer.toString(number);
		System.out.println("int to String: "+intToString);
		
		//float to String
		float number2=34.67f;
		String floatToString= Float.toString(number2);
		System.out.println("float to String: "+floatToString);
		
		//double to String
		double number3=67.89;
		String doubleToString= Double.toString(number3);
		System.out.println("double to String: "+doubleToString);
		
		
		
		
		
		
		
	}
}
