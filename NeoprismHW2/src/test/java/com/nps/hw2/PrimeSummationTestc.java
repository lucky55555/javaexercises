package com.nps.hw2;

import org.junit.Assert;
import org.junit.Test;

public class PrimeSummationTestc {

	@Test
	
	public void PrimeSum(){
		PrimesSummation ps = new PrimesSummation();
		int actualresult = ps.PrimeSum(1000);
		Assert.assertEquals(76127,actualresult);
	}
}
