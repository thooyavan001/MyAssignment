package week1.assignment;

public class ReverseString {
	public static void main(String[] args) {
		//Declare String name
		String name="Learning Java";
		//Initialize string to upper case
		String upperCase = name.toUpperCase();
		//split each characters from string using toCharArray
		char [] charArray=upperCase.toCharArray();
		//Initialize For loop as Decrement
		for (int i = charArray.length-1; i >=0 ; i--) {
			//Print the Value
			System.out.println(charArray[i]);
		}
		
	}

}
