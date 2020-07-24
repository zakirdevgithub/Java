package com.pack2;
import com.pack1.Student;

public class Example{
	public static void main(String[] args){
		Student st= new Student();
		st.setName("Zakir");
		st.setRoll(24);
		System.out.println(st.getName());
		System.out.println(st.getRoll());
	}
}