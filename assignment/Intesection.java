package week1.assignment;

import java.util.Arrays;

public class Intesection {
	public static void main(String[] args) {
		//declare the int arrays values
		int[] num1= {10,20,30,40,50,60};
		int[] num2= {15,10,25,35,45,40};
		//sort the values in ascending order 
		Arrays.sort(num1);
		Arrays.sort(num2);
		//initialize the for loop
		for (int i = 0; i < num1.length; i++) {
			//initialize the nested for loop
			for (int j = 0; j < num2.length; j++) {
				//initialize the condition
				if(num1[i]==num2[j]) {
				//print the values
				System.out.println(num1[i]);
				
			}
			
		}
		
		
	}

	}}
