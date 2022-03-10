package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops"; // *Declare a String 
		String text2 = "potss"; // *Declare a String 
		   boolean status = true; 
		if (text1.length() != text2.length()) { //Check length of the strings are same then (Use A Condition)
			status = false;  
		}else {
			
			char[] ArrayText1=text1.toCharArray();//Convert both Strings in to characters
			char[] ArrayText2=text2.toCharArray(); //Convert both Strings in to characters
			Arrays.sort(ArrayText1);  //Sort Both the arrays
            Arrays.sort(ArrayText2);  //Sort Both the arrays
            status = Arrays.equals(ArrayText1, ArrayText2);  //Check both the arrays has same value
        }  
        if (status) {  
            System.out.println(text1 + " and " + text2 + " are anagrams");  
        } else {  
            System.out.println(text1 + " and " + text2 + " are not anagrams");  
        }
	}
}
              
	