package week3.day2;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] array1= {1,4,8,2,3,6,7};
		
		// output;5
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] !=i+1) {
				System.out.println(i+1);
				break;
			}
			
		}
	
	}

}
