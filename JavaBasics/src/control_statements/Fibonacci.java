package control_statements;

public class Fibonacci {

	public static void main(String[] args) {
		// Write a program to find out first 20 numbers of Fibonacci series
		//0 1 1 2 3 5 8 13 21 
int num1=0;
int num2=1;
int num3=0;
System.out.println(num1);
System.out.println(num2);
for(int i=0; i<=18; i++) {
	num3=num1+num2;
	System.out.println(num3);
	num1=num2;
	num2=num3;
	}
	}

}
