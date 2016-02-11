package com.nps.hw2;

public class PrimesSummation {
	
	// sum of all primes below 10 is 17

	//sum of all primes below 1000 ?
	public static void main(String[] args){
	//PrimesSummation ps = new PrimesSummation();
		System.out.println(PrimeSum(10));
		//System.out.println("sum ="+sum);
}

public static int PrimeSum(int num){
		int sum=0;
		for(int i=2; i<num; i++){
			int flag=0;
			for(int j=2; j<i;j++)
			if(i%j==0)
				flag=1;
			
			if(flag==0){
			
			//System.out.print(i+" ");
			sum+=i;
		}
			//System.out.println("sum "+sum);	
		}return +sum;	

}


}
