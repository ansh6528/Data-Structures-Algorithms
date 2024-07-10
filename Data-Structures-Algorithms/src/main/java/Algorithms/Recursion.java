package Algorithms;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		walk(3);
		System.out.println(factorial(3));
		System.out.println(power(2, 3));
	}

	private static int power(int base, int exponent) {
		// TODO Auto-generated method stub
		if(exponent < 1) return 1; //base case
		return base * power(base, exponent - 1); //recursive case
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num < 1) return 1; //base case
		return num * factorial(num - 1); //recursive case
	}

	private static void walk(int steps) {
		// TODO Auto-generated method stub
		if(steps < 1) return; //base case
		System.out.println("You take a step!");
		walk(steps - 1); //recursive case
	}

}
