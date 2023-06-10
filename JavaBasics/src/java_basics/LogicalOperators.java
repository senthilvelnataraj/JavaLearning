package java_basics;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical AND &&
		//Logical OR ||
		//Logical not !
		//Bitwise AND &
		//Bitwise OR |
		//Bitwise compliment ~
		int num1=45;
		int num2=6;
		boolean b=true;
		System.out.println(num1>num2 && num2<num1);
		System.out.println(num1>num2 || num2<num1);
		System.out.println(!b);
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(~num1);
	}

}
