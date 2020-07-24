
public class WrapperAutoboxing {

	public static void main(String[] args) {
		
		int num=24; //Primitive data type
		@SuppressWarnings("deprecation")
		Integer intNum=new Integer(num); //Wrapping or Boxing
		int anotherNum= intNum; //Unwrapping or Unboxing
		
		Integer number=num; //Autoboxing or Auto Wrapping
		
		Integer i=Integer.valueOf("11101001011",2); //Binary to decimal
		System.out.println(i);
		
		int d= i.intValue();
		System.out.println(d);
		
		Integer stringToInt= Integer.parseInt("123");
		System.out.println(stringToInt);
		
		// character to float
		char ch= '3';
		//float charToString= Float.valueOf(ch); //it will give ASCII value
		// must convert to String first
		String charToString=String.valueOf(ch);
		float StringToFloat= Float.parseFloat(charToString);
		System.out.println(StringToFloat);


		
		
	}

}
