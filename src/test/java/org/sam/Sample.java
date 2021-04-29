package org.sam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	 private void lauanch() {
		System.out.println("alaunch");

	}
	@Test
	 private void tc1() {
		 System.out.println("tc1");

	}
	@AfterClass
	private void close() {
		 System.out.println("close");

	}

}
