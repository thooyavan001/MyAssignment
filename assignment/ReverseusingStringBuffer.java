package week1.assignment;


public class ReverseusingStringBuffer {
	public static void main(String[] args) {
		//declare String using string buffer
		StringBuffer name=new StringBuffer("Thooyavan");
		//initialize the another string name using Append
		name.append(" Balachandiran");
		//reverse the string values
		StringBuffer reverse=name.reverse();
		//declare string length
		int length=reverse.length();
		//print the length
		System.out.println(length);
		String string=reverse.toString();
		//initialize the string to upper case
		String upperCase=string.toUpperCase();
		System.out.println(upperCase);
		
	}

}
