package org.sam;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactSearch extends Base{
	//@Parameters({"location","rooms"})
	@Test(dataProvider="SampleData",dataProviderClass=Datas.class)
	private void tc2(String loc,String room) throws IOException {
		AdactinPojo p=new AdactinPojo();
		selectVisible(p.getLocClk(),loc);
		selectIndex(p.getHotelClk(),1);
		selectValue(p.getRoomClk(),room);
		selectVisible(p.getRoomsClk(),"1 - One");
		 String path1="C:\\Users\\ADMIN\\eclipse-workspace\\AdactinPro\\Testdata\\Adactin_data.xlsx";
		textSend(p.getDateIn(),read(path1,"Adactin",2,2));
		SoftAssert s=new SoftAssert();
		s.assertTrue(read(path1,"Adactin", 2, 2).equals("06-02-202"),"Assert fail");
		//s.assertAll();
		textSend(p.getDateOut(),read(path1,"Adactin",2,3));
		selectVisible(p.getAdultRm(),"1 - One");
		clkBtn(p.getSearchClk());
		clkBtn(p.getRadioClk());
		clkBtn(p.getConClk());
	
	}	
		
		
		
	
	

	
}
