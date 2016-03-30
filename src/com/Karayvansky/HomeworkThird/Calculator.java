package com.Karayvansky.HomeworkThird;

public class Calculator {

	public static void main(String[] args) {
		double firstNumber, secondNumber;
		double result;
		String operation;
		operation = (args[0]);
		firstNumber = Double.parseDouble(args[1]);
		secondNumber = Double.parseDouble(args[2]);
		System.out.println("" + firstNumber + " " + operation + " " + secondNumber);

		switch (operation) {
		case "multipli":
			result = firstNumber * secondNumber;
			System.out.println("Result = " + result);
			break;
		case "divided":
			result = firstNumber / secondNumber;
			System.out.println("Result = " + result);
			break;
		case "fold":
			result = firstNumber + secondNumber;
			System.out.println("Result = " + result);
			break;
		case "subtract":
			result = firstNumber - secondNumber;
			System.out.println("Result = " + result);
			break;
		default:
			System.out.println("Wrong entry");
			break;
		}
	}
}
