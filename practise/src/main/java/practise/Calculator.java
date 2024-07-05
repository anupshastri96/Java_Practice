package practise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number 1:");
		Double num1 = scanner.nextDouble();
		
		System.out.print("Enter number 2:");
		Double num2 = scanner.nextDouble();
		
		System.out.print("Enter operator:");
		char operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println("Addition: "+(num1+num2));
			break;
		case '-':
			System.out.println("Substraction: "+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication: "+(num1*num2));
			break;
		case '/':
			if(num2!=0) {
				System.out.println("Division: "+(num1/num2));
			}else {
				System.out.println("You cannot divide by Zero");
			}
			break;
		default:
			System.out.println("Invalid Operator!");
			
		}
		}
			
	}

}
