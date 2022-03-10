package week3.day2;

public class FindTypes {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i <= value.length(); i++) {
			char c=value.charAt(i);
			 if(Character.isLetter(c)) {
				System.out.println(c+ "  is Letter"); 
			 }
			 else if (Character.isDigit(c)) {
				 System.out.println(c+ " is Number");  
				
			}
			 else if (Character.isSpaceChar(c)) {
				 System.out.println(c+ " is space");
			 }else
			 {
				 System.out.println(c+ " is specialchar"); 
			 }
			
				 
				
			} 
				 
				
			}
	
			 }
        	
        
	


		


		
		
			
	
	

	
