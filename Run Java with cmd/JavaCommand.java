
public class JavaCommand{

    public static void main(String[] args){

	int num=0;
	for (int i=0; i<args.length; i++){
	num= num+Integer.parseInt(args[i]);
  }
	System.out.println("Sum is:"+num);
}
}