package com.nps.hw2;

import java.util.Scanner;

public class CircuitDesign {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("please enter two numbers: ");

int x = sc.nextInt();

int y = sc.nextInt();
System.out.print(x+" "+y+" ");
System.out.print(CircuitD(x,y));

}

	
	public static int CircuitD(int x, int y){
		int output =  x^y;
		return output;
	}
}
