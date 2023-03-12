package week1.assignment;

public class Factorial {
	public static void main(String[] args) { 
		//declare the int values
		int a=7;
		// initialize fact value is 1
		int fact=1;
		//initialize for loop
		for (int i = a; i > 0; i--) {
			//store the iterated values in fact
			fact=fact*i;
				
		}
		System.out.println("The factorial of 7 is ; "+ fact);
		
	}

}
