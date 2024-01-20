package com.application;

/**
 * Create a class MortgageCalculator App
 */
public class MortgageCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Mortgage calculator application is starting");
		
		printDots(30);
	
	}
	
	private static void printDots(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
