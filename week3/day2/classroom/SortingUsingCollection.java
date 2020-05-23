package week3.day2.classroom;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//get the length of the array		

//sort the array			

//Iterate it in the reverse order

//print the array

//Required Output: Wipro, HCL , CTS, Aspire Systems

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] Array = {"HCL","WIPRO","Aspire Systems","CTS"};
		int arrayLength = Array.length;
		Arrays.sort(Array);
		Set<String> ArraySet = new LinkedHashSet<String>();
		for(int i =arrayLength-1; i>=0;i--) {
		ArraySet.add(Array[i]);
		}
		System.out.println(ArraySet);
		
		

	}

}
