package java_basics;

public class StaticMethods {

	static void StaticMethod() {
		System.out.println("Static method");
	}
	public void nonStaticMethod() {
		System.out.println("Non-static method");
		StaticMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticMethods methods=new StaticMethods();
StaticMethod();
methods.nonStaticMethod();

	}

}
