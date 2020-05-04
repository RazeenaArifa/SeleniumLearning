package week1.day1.assignments;


public class PrimeNumber {

	public static void main(String[] args) {

		int input=13;
		int remainder;
		boolean flag=false;
		
		
				for (int i = 2; i <= input/2; i++) {
			remainder=input%i;
			if(remainder==0)
			{
				flag=true;
				break;
				
					
			}

		}
		
		if(flag==true) {
			System.out.println("Not a Prime");
		}
		else
			System.out.println("Prime");
	}

}
