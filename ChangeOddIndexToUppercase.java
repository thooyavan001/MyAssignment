package week3.day2;

public class ChangeOddIndexToUppercase {
	
	    public static void main(String[] args) {
	        String test = "changename";
	        //Convert the string into character array
	        char[] ch = test.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
	            if (i % 2 != 0){
	                //Using character class for changing character to uppercase
	                ch[i] = Character.toUpperCase(ch[i]);
	            }
	        }
	        //Printing the new string
	        System.out.print(ch);

	    }

	}


