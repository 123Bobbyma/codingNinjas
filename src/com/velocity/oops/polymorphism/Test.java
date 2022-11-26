package com.velocity.oops.polymorphism;

public class Test {
  
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition of 2 is "+c);
	}
	public void add(int a,int b, int c) {
		int d= a+b+c;
		System.out.println("Addition of 3 is "+d);
	}
	
	//Return type will be anything r̥
	public String add(String name , int num ) {
		
		System.out.println("EMPLOYE NAME IS "+name);
		System.out.println("EMPLOYE NUM IS "+num);

		return name;		
	}
	void add(String fName, String lName) {
		String name = fName +" "+lName;
		System.out.println("emp full name is "+ name);
	}
}
