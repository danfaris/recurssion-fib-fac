package com.tube.you;

public class Fibonacci {

	public static int fibonacci(int n) {
		
		int fib;
		if ((n == 1) || (n == 2)) {
			fib = 1;
		} else {
			fib =   fibonacci(n - 1) + fibonacci(n - 2);
			System.out.println(fibonacci(n - 1) + "\t" + fibonacci(n - 2));
		}
		return fib;
	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 7;
		
		System.out.println(fibonacci(7));
		
		System.out.println("-----FACTORIAL-----");
		System.out.println(fact(n) + " is factorial of " + n);
		
		
	}

}
