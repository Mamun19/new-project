package com.usa.smarttech;






public class Test {
	
	static String name1;
	static int num1;
	static double d;
	// class level variable/ global variable
static	int num = 100;

String name = "Smarttech";

boolean b = true;
boolean b1 = false;
	
	
	// instance variable
int num2 = 100;
double a = 12;
	public static void main(String[] args) {
		//how you call the method inside the main method ?
				// ANS: if void method i need to create an object
				// How you create the object and write the syntax
				//ANS: By class name and ClassName objectName = new className ();
				
				
			// HOW java know you create the object?
		    //ANS: By new keyword
			
			//  how you call static method ?
		    //  ANS; By class name 
		Test abc = new Test();
		abc.getmyName();
		
		
		
		

	}
	
	public void myName() {
		a = 100;
	}
	
	public String getmyName() {
		return name;
		
	}
	
	public int getName() {
		return 100;}
	// void and parameterized method
	static void getSalary(int saary) {
		
	}
	
	//  void and non parameterized method
	void getName1() {
		
	}
	

	
	
	
	
	}
	
	
	
	
	
	


