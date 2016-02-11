package com.nps.hw2;

public class Multiples {

	public static void main(String[] args) {
	
		System.out.println(GetSumMult(1000));
		
		
	}
		public static int GetSumMult(int num){
			int sum=0;
			
			for(int i=1; i<num;i++){
				
				if((i%3 == 0 | i%5 == 0)){
					sum+=i; //it can be divided by 3 or 5 add to sum.
									
				}	
		}
			return sum;
			
	}


}
		//System.out.println(sum);	
	

		
	
	
	
	
	
	
	
		
		
		
