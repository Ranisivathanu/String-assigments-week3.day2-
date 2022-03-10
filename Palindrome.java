package week3.day2;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           String input="madam"; //Declare A String value as"madam"
        	String revStr=" ";//Declare another String rev value as ""
           int inputLength =input.length();
          for (int i =(inputLength-1) ; i >=0; --i) { //Iterate over the String in reverse order
			revStr=revStr+input.charAt(i);//Add the char into rev
		}
		   if (input.equals(revStr)){ //Compare the original String with the reversed String, if it is same then print palinDrome // Use .equals or .equalsIgnoreCase when you compare a String 
			System.out.println(input + " is a Palindrome String");
			
		}else
		{
			System.out.println(input+ " is a Palindrome String");
		}
	}
}
	
	
	


