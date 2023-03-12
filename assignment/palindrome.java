package week1.assignment;

public class palindrome {
	public static void main(String[] args) {
		//initialize the string name
		String name="Appa";
		//create the empty string as reverse
		String rev="";
		//initialize the string to upper case
		String uppercase=name.toUpperCase();
		//split each character from string using tochararray
		char[] charArray = uppercase.toCharArray();
		//initialize for loop
		for (int i =charArray.length -1; i >= 0; i--) {
			// store the iteration in rev string
			rev=rev+charArray[i];
			
		}
	    System.out.println(rev);
	    //iterate if condition 
	    if(name.equalsIgnoreCase(rev)) {
	    	//print the values 
	    	System.out.println("it is a palindrome");
	    }else {
	    	System.out.println("it is not a palindrome");
	    }
		
	}

}
