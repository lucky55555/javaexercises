package com.nps.hw2;

import org.junit.Assert;
import org.junit.Test;

public class CircuitDesignTest {
	@Test
	
	public void CircuitD(){
		CircuitDesign cd = new CircuitDesign();
		int actualresult = cd.CircuitD(1,1);
		Assert.assertEquals(0,actualresult);
	}

}
