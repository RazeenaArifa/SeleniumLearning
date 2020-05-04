package week1.day2.classroom.string;

public class FindType {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray=test.toCharArray();
		for(char i:charArray) {
			if(Character.isLetter(i)) {
				letter=letter+1;
			
		}
			else if(Character.isDigit(i)) {
				num=num+1;
			}
			else if(Character.isSpaceChar(i)) {
				space=space+1;
			}
		
		else
			specialChar=specialChar+1;

		
	}

		System.out.println("Letter: "+letter);
		System.out.println("Number: "+num);
		System.out.println("Space: "+space);
		System.out.println("SpecialCharacter: "+specialChar);
	}
	}
