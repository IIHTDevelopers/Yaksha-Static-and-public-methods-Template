package com.yaksha.assignment;

class MathOperations {

	// Static method to calculate the square of a number
	public static int squareNumber(int num) {
		return num * num;
	}
}

// Class with Public Methods
class MathHelper {

	// Public method to add two numbers
	public int addNumbers(int a, int b) {
		return a + b;
	}
}

// Main Class to test the methods
public class StaticAndPublicMethodsAssignment {

	public static void main(String[] args) {
		// Calling the static method from MathOperations class directly
		int squareResult = MathOperations.squareNumber(5);
		System.out.println("Square of 5: " + squareResult);

		// Creating an object of MathHelper class to call the public method
		MathHelper helper = new MathHelper();
		int sumResult = helper.addNumbers(10, 20);
		System.out.println("Sum of 10 and 20: " + sumResult);
	}
}
