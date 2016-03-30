package com.Karayvansky.HomeworkThird;

import java.util.Scanner;

public class ThirdHomework {

	public static void main(String[] args) {
		calculate();
		expecttip();
	}

	public static void calculate() {
		System.out.println("***Calculator!***");
		Scanner sc = new Scanner(System.in);
		double a, b;
		double result;
		String operation;
		System.out.print("Input your operation: ");// символы для удобства ввода
		operation = sc.next();
		System.out.print("Input your first number: ");
		a = sc.nextInt();
		System.out.print("Input your second number: ");
		b = sc.nextInt();
		switch (operation) {
		case "*":
			result = a * b;
			System.out.println(result);
			break;
		case "/":
			result = a / b;
			System.out.println(result);
			break;
		case "+":
			result = a + b;
			System.out.println(result);
			break;
		case "-":
			result = a - b;
			System.out.println(result);
			break;
		default:
			System.out.println("Wrong entry");
			break;
		}
	}

	public static void expecttip() {
		System.out.println("***Tips!***");
		Scanner sc = new Scanner(System.in);
		double sum, tips;
		String level;
		System.out.print("Input your sum: ");
		sum = sc.nextDouble();
		System.out.print("Input your level of service: ");
		level = sc.next();
		sc.close();
		switch (level) {
		case "terrible":
			tips = sum;
			System.out.println("Tips: " + tips);
			break;
		case "poor":
			tips = sum * 0.05;
			System.out.println("Tips: " + tips);
			break;
		case "good":
			tips = sum * 0.1;
			System.out.println("Tips: " + tips);
			break;
		case "great":
			tips = sum * 0.15;
			System.out.println("Tips: " + tips);
			break;
		case "excellent":
			tips = sum * 0.2;
			System.out.println("Tips: " + tips);
			break;
		default:
			System.out.println("Wrong entry");
		}
	}

}
