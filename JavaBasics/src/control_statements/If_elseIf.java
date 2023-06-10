package control_statements;

public class If_elseIf {

	public static void main(String[] args) {
		/*Create a program to find a grade of a student
		marks>=90 ->A grade
		marks>=80 =>B grade
		marks>=70 =>C grade
		marks>=50 =>D grade
		marks<50 =>Fail*/
		int mark=85;
		if(mark>=90) {
			System.out.println("A grade");
		}else if(mark>=80)
		{
			System.out.println("B grade");
		}else if(mark>=70)
		{
			System.out.println("C grade");
		}else if(mark>=50)
		{
			System.out.println("D grade");
		}else {
			System.out.println("Fail");
		}
	}

}
