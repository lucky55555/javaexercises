package com.hw.Q5;

import java.util.Scanner;

public class Question10 {
	public static void main(String args[]){
	boolean prime=true;	
Scanner sc = new Scanner(System.in);
System.out.println("please enter a number");

int n = sc.nextInt();
for(int i=2;i<n;i++){
	if(n%i==0){
	prime=false;
	}
}
if(prime==true){
	System.out.println("numbers is prime "+prime);
}
else{
	//prime=false;
	System.out.println("number is not a prime "+prime);
}
	
	}
}
	        
	    
	    
	