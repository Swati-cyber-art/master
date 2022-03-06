package com.modifier;

class accessSpecifiers1
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class  defAccessSpecifier{

	public static void main(String[] args) {
		//default
		System.out.println("Running Dafault Access Specifier");
		accessSpecifiers1 obj = new accessSpecifiers1(); 		  
        obj.display(); 

	}
}

