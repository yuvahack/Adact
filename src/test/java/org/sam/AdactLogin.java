package org.sam;

import java.io.IOException;

import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactLogin extends Base {
	
	@Parameters("browse")
	@BeforeClass
	private void browse(String brow) {
		if(brow.equals("chrome")) {
			systemConfig();
		}
		else if(brow.equals("IE")) {
			systemConfig1();
		}
		else {
			systemConfig2();
		}
		 launchUrl("https://adactinhotelapp.com/");
		 max();
		
	}
	//invocationCount=3
	// @Test(priority=-1)
	// private void tc2() {
		  
		
        
			 
	// }
	  
	 @Test 
	 private void tc1() throws IOException {
		 
		     
			 
		 AdactinPojo p=new AdactinPojo();
		 String path1="C:\\Users\\ADMIN\\eclipse-workspace\\AdactinPro\\Testdata\\Adactin_data.xlsx";
		 textSend(p.getUsrName(),read(path1, "Adactin",2, 0));
		 textSend(p.getUsrPass(), read(path1, "Adactin",2, 1));
		 clkBtn(p.getClkBtn());
//	public static void main(String[] args) {
//		systemConfig();
//		launchUrl("https://adactinhotelapp.com/");
//		
//	}
	
	 }
}
