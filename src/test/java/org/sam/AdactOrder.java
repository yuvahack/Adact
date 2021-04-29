package org.sam;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactOrder extends Base {
	 @Parameters({"month","year"})
	@Test
	private void tc3(String mon, String yr) throws IOException {
		AdactinPojo p=new AdactinPojo();
		 String path1="C:\\Users\\ADMIN\\eclipse-workspace\\AdactinPro\\Testdata\\Adactin_data.xlsx";
		textSend(p.getTxtFname(),read(path1,"Adactin",2,4));
		textSend(p.getTxtLname(),read(path1,"Adactin",2,5));
		textSend(p.getTxtAddrs(),read(path1,"Adactin",2,6));
		textSend(p.getTxtCreditNo(),read(path1,"Adactin",2,7));
		selectVisible(p.getCreditType(),"American Express");
		selectVisible(p.getMonth(),mon);
		selectVisible(p.getYear(),yr);
		textSend(p.getTxtCvv(),read(path1,"Adactin",2,8));
		clkBtn(p.getBook());
	    urlDynamic(5, "https://adactinhotelapp.com/BookingConfirm.php");
	     String text=textAttribute(p.getOrderNo(),"value");
	    System.out.println(text);
	    write(path1, "Adactin",2, 9, text);
	    
		
	}

}
