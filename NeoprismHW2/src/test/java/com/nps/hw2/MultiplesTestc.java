package com.nps.hw2;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesTestc {

	
	
	@Test

    public void GetSumMult(){
	Multiples mo = new Multiples();
	int actualresult = mo.GetSumMult(1000);
	Assert.assertEquals(233168,actualresult);
}
	
}
