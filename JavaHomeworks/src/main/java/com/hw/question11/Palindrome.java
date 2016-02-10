package com.hw.question11;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
//check whether the given number is in palindrome or not
	
	Scanner sc = new Scanner(System.in);
	
System.out.println("please enter the number");
	
int n = sc.nextInt();

int t=n;

int r,s=0;
while(n>0){
r = n%10;
n=n/10;
s=s*10+r;
}
if(t==s){
System.out.println("number is in palindrome");
}
else{
	System.out.println("numbers is not in palindrome");
}

	
	}

}
