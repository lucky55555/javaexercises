package com.nps.hw2;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumbersTest {

	
	
		@Test
		
		 public void Fibonacci(){
			FibonacciNumbers fb = new FibonacciNumbers();
			int actualresult = fb.Fib();
			Assert.assertEquals(798,actualresult);
}
}