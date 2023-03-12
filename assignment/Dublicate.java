package week1.assignment;

import java.util.Arrays;

public class Dublicate {
	public static void main(String[] args) {
		//declare the integer arrays values
		int[] num = {11,21,31,41,51,11,51,61,71};
		//sort the values as ascending order
		Arrays.sort(num);
		//initialize the for loop 
		for (int i = 0; i < num.length; i++) {
			//initialize the nested for loop
			for (int j = i+1; j < num.length; j++) {
				//initialize the condition
				if(num[i]==num[j]) {
				//print the iterated values
					System.out.println(num[i]);
					
				}
				
			}
			
		}
	
			
		}
		
	}


