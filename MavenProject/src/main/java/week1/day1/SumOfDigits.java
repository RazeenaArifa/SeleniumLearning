package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int rem;
		while (num>0) {
			rem=num%10;
			System.out.println(rem);
			sum=sum+rem;
			num=num/10;
			System.out.println(num);
		}
System.out.println(sum);
	}

}
