package week1.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		int dataLen=data.length;
		System.out.println(data[dataLen-2]);
			
		
	}

}
