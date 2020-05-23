package week3.day2.classroom;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Input: "PayPal India"
//Output:ylIndi

		
		
//		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print each character for charSet

	



public class RemoveDuplicates {
	
	

	public static void main(String[] args) {
		String input ="PayPal India";
		char[] charArray = input.toCharArray();
		Set <Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();
		for (char i: charArray) {
			if(charSet.contains(i)) {
				dupCharSet.add(i);
			}
			else
			charSet.add(i);
			
		}
		
		for(Character i: dupCharSet) {
			if(charSet.contains(i))
			{
				charSet.remove(i);
			}
			
		}
		
		for(Character i: charSet) {
			if(i!=' ')
			System.out.print(i);	
		}
		
		
		//System.out.println(charSet);
		//System.out.println(dupCharSet);

	}

}
