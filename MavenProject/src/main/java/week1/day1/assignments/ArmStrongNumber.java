package week1.day1.assignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int input =153;
		int calculated=0;
		int remainder =0;
		int original=0;
		original=input;
		while(original>0) {
			remainder=original%10;
			calculated=calculated+(remainder*remainder*remainder);
			original=original/10;
		}
		System.out.println(calculated);
if(calculated==input)
	System.out.println("Armstrong Number");
	}

}
