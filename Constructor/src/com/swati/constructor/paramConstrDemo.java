package com.swati.constructor;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paramConstrDemo {
public static void main(String[] args) {
System.out.println("****Information****");
	Std std1=new Std(1,"Swati");
	Std std2=new Std(10,"Pooja");
	std1.display();
	std2.display();
		}
}
