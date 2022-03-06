package com.casting;

public class typeCasting {

	public static void main(String[] args) {

		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of Char a : "+a);
		
		int b=a;
		System.out.println("Value of integer b: "+b);
		
		float c=a;
		System.out.println("Value of float c: "+c);
		
		long d=a;
		System.out.println("Value of long d: "+d);
		
		double e=a;
		System.out.println("Value of double e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}
