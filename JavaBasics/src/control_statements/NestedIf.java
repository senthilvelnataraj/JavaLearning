package control_statements;

public class NestedIf {

	public static void main(String[] args) {
		int mark=70;
		if(mark>50) {//loop inside loop
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

}
