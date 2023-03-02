package week2.day1;

public class Calculator {
	public void additionTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subraction(int e,int f) {
		int c=e-f;
		System.out.println(c);
	}
	public void divideTwoNumbers(int i,int j) {
		int c=i/j;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.additionTwoNumbers(100,10);
		calc.divideTwoNumbers(200,20);
		calc.subraction(100,50);
		
	}

}
