package week1.assignment;

public class PrintEvenWords {
	public static void main(String[] args) {
		//declare the sting variables
		String text="I am mechanical student";
		//split the sentence to each word
		String[] str=text.split(" ");
		//initialize for loop
		for (int i = 0; i < str.length; i++) {
			//initialize if condition
			;
			if(i%2 != 0) {
				//print the values
				System.out.println(str[i]);
				
			}
		
			
		}
	}

}
