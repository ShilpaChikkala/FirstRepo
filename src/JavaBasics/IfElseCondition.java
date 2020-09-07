package JavaBasics;
//comparison operators
//< > <= >= == !=
public class IfElseCondition {

	public static void main(String[] args) {

		int a= 10;
		int b=30;
		
		if(a>b) {
			System.out.println("a is greater ");
		}
		else {
			System.out.println("b is greater ");
		}
		int c = 40;
		int d = 50;
		if (c==d) {
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		//nested if -else
		int a1 = 200;
		int b1 = 10;
		int c1 = 450;
		if(a1>b1 & a1>c1) {
			System.out.println("a1 i greater");
			
		}else if (b1>c1 & b1>c1) {
			System.out.println("b1 is greater");
			
		}else {
			System.out.println("c1 is greater");
		}
		
		
		
	}

}
