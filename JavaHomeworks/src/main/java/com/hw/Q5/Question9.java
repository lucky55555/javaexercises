package com.hw.Q5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int num = sc.nextInt();
		//check whether the number which u have entered is even or odd.
		boolean even;
		
		if(num%2 == 0){
			even=true;
			System.out.println("number is even and it is "+even);
		}	
			else{
				even=false;
				System.out.println("its not an even number and it is "+even);
			}
		

	}

}
