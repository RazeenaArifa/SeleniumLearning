package week1.day2.classroom.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		char[] ch=test.toCharArray();
		//pseudo 1
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		System.out.println("***********");
		//pseudo 2
		int length=test.length();
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(test.charAt(i));
		}
	}

}
