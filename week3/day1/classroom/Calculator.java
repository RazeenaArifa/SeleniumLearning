package week3.day1.classroom;

public class Calculator {
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Result is :"+  sum);
	}
	public void add(int a, int b,int c) {
		int sum = a+b+c;
		System.out.println("Result is :"+  sum);
	}
	public void multiply(int a, int b) {
		int multiply = a*b;
		System.out.println("Result is :"+  multiply);
	}
	public void multiply(int a, double b) {
		double multiply = a*b;
		System.out.println("Result is :"+  multiply);
	}
	public void subtract(int a, int b) {
		int subtract = a-b;
		System.out.println("Result is :"+  subtract);
	}
	
	public void subtract(double a, double b) {
		double subtract = a-b;
		System.out.println("Result is :"+  subtract);
	}

	public void divide (int a, int b) {
		int divide = a/b;
		System.out.println("Result is :"+  divide);
	}
	public void divide (double a, int b) {
		double divide = a/b;
		System.out.println("Result is :"+  divide);
	}
	public static void main(String[] args) {
		Calculator C= new Calculator();
		C.add(2,3);
		C.add(5, 3,2);
		C.multiply(3, 3);
		C.multiply(3, 2.5);
		C.subtract(10, 5);
		C.subtract(20.5, 5.5);
		C.divide(10, 2);
		C.divide(20.5, 5);

	}

}
