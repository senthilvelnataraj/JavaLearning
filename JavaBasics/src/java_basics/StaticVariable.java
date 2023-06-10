package java_basics;

public class StaticVariable {
int rollNo;
String name;
static String collegeName="NGP";

StaticVariable(int r, String n) {
rollNo=r;
name=n;
System.out.println(rollNo+" "+name+" "+collegeName);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticVariable obj=new StaticVariable(19, "Keerthana");

	}

}
