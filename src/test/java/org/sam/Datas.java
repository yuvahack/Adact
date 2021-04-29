package org.sam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datas{
	

@DataProvider(name="SampleData")
public Object[][] data(){
	
	return new Object[][] {
		
		{"Sydney","Standard"},
	 
		
	};
	
	
}
}