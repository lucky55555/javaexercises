package com.nps.hw2;

public class FibonacciNumbers {
	static int evensum=0;
	static int num=1000;
	static int n=0;
	public static void main (String[] args){
		FibonacciNumbers fb = new FibonacciNumbers();
		System.out.println("even valued fibonacci sequence");
		fb.Fib();
	}
	
	public  int Fib(){
		int [] fib = new int [num];
		for(int i=2 ; n<1000;i++){
			fib[0]=0;
			fib[1]=1;
			 fib[i] = fib[i-1]+fib[i-2];
			 n=fib[i];
			System.out.println(fib[i]);
		}
		
			 for(int i=1; i<num;i++){
				 
			 if(fib[i]%2==0)
				 evensum+=fib[i];
			 }
			  System.out.println("sum is:"+evensum);
				 //System.out.println(n); 
				 
				//return n;
				
			
			return n;
		
		
	}
}

