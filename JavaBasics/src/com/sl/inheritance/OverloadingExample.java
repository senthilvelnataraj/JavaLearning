package com.sl.inheritance;

public class OverloadingExample {
public void addition(int a, int b) {
	System.out.println(a+b);
}
public void addition(double a, int b) {
	System.out.println(a+b);
}
public void addition(int a, double b) {
	System.out.println(a+b);
}
	
public void addition(double a, double b, double c) {
	System.out.println(a+b+c);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverloadingExample example=new OverloadingExample();
example.addition(5, 5);
example.addition(0.07, 5);
	}

}
