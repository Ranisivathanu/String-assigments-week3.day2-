package week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; //Declare the input as Follow
		String[] s =test.split(" ");//split the words and have it in an array
		System.out.println(Arrays.toString(s));
		String rev = "";
		for (int i = 0; i < s.length; i++) { //Traverse through each word (using loop)
			if (i % 2 == 1) //find the odd index within the loop (use mod operator)
		        rev = rev + new StringBuilder(s[i]).reverse().toString() + " "; //split the words and have it in an array
		    else
		        rev = rev + s[i] + " ";
		}
          System.out.println(rev);
				
				
			
			
		}
		
		
	
	
	
	}


