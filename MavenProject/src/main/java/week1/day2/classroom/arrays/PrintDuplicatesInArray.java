package week1.day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					count=count+1;

				}
				}
			if(count>1)
			{
				System.out.println("Duplicate "+arr[i]);

			}
		}
	}
}
