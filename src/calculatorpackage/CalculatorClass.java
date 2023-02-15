package calculatorpackage;

import java.util.Scanner;

public class CalculatorClass {

	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	public static int sub(int number1, int number2) {
		return number1 - number2;
	}
	public static int mul(int number1, int number2) {
		return number1 * number2;
	}
	public static double div(int number1, int number2) {
		if (number2 ==0) {
			throw new IllegalArgumentException("Number cannot be divided by 0");
		}
		return number1 / number2;
	}
	public static double divReal(int number1, int number2) {
		if (number2 ==0) {
			throw new IllegalArgumentException("Number cannot be divided by 0");
		}
		return (double) number1 / number2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int input = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int input1 = sc.nextInt();
		
		System.out.println("The Addition is : " + CalculatorClass.add(input, input1));
		System.out.println("The Substraction is : " + CalculatorClass.sub(input, input1));
		System.out.println("The Multiplication is : " + CalculatorClass.mul(input, input1));
		System.out.println("The Division is : " + CalculatorClass.div(input, input1));
	}
}
