package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo extends Base {
	public AdactinPojo() {
		 PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement usrName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement usrPass;
	@FindBy(xpath="//input[@id='login']")
	private WebElement clkBtn;
	@FindBy(xpath="//select[@id='location']")
	private WebElement locClk;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotelClk;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomClk;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomsClk;
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement dateIn;
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement dateOut;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultRm;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement searchClk;
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioClk;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement conClk;
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtFname;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txtLname;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement txtAddrs;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement txtCreditNo;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement creditType;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement txtCvv;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;
	@FindBy(xpath="//input[@id='order_no']") 
	private WebElement orderNo;
	
	public WebElement getUsrName() {
		return usrName;
	}
	public WebElement getUsrPass() {
		return usrPass;
	}
	public WebElement getClkBtn() {
		return clkBtn;
	}
	public WebElement getLocClk() {
		return locClk;
	}
	public WebElement getHotelClk() {
		return hotelClk;
	}
	public WebElement getRoomClk() {
		return roomClk;
	}
	public WebElement getRoomsClk() {
		return roomsClk;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdultRm() {
		return adultRm;
	}
	public WebElement getSearchClk() {
		return searchClk;
	}
	public WebElement getRadioClk() {
		return radioClk;
	}
	public WebElement getConClk() {
		return conClk;
	}
	public WebElement getTxtFname() {
		return txtFname;
	}
	public WebElement getTxtLname() {
		return txtLname;
	}
	public WebElement getTxtAddrs() {
		return txtAddrs;
	}
	public WebElement getTxtCreditNo() {
		return txtCreditNo;
	}
	public WebElement getCreditType() {
		return creditType;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	
   
}
