package com.hw.Q5;

import java.util.Scanner;

public class Question6 {
 
	public static void main(String[] args) {
		int sum;
		 int sub;
		 double mult;
		 float div;
		//importing scanners to get input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

	//perform addition, substraction, multiplication and division with two numbers got as input
		
				sum = num1+num2;
				System.out.println("Addition");
				System.out.println(sum);
				sub = num1-num2;
				System.out.println("Substraction");
				System.out.println(sub);
				
				mult = num1*num2;
				System.out.println("Multiplication");
				System.out.println(mult);
				
				div = num1/num2;
				System.out.println("Division");
				System.out.println(div);
				
	
		
	}

}
