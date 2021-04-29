package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	 public static WebDriver driver;
	 public static Actions a;
	 public static Robot r;
	 public static JavascriptExecutor js;
	 public static  Alert a1;
	 public static WebDriverWait w;
	 public static String parid;
	 public static Set<String> parchildId;
	  
		 public static WebDriver systemConfig() {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Testing1\\driver\\chromedriver.exe");
			 return driver=new ChromeDriver();
			 
			 
		 }
		 public static WebDriver systemConfig1() {
			 System.setProperty("webdriver.IE.driver","C:\\Users\\ADMIN\\eclipse-workspace\\AdactinPro\\driver\\IEDriverServer.exe");
			return driver=new InternetExplorerDriver();
			 
		 }
		 public static WebDriver systemConfig2() {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\eclipse-workspace\\AdactinPro\\driver\\geckodriver.exe");
				return driver=new FirefoxDriver();
				 
			 
 
			 
		 }
		 public static void webdriverSetup() {
			 WebDriverManager.chromedriver().setup();
		 }
		 public static void launchUrl(String str) {
			 
			 driver.get(str);
		 }
		 public static void textSend(WebElement e,String str) {
			 e.sendKeys(str);
			 
		 }
		 public static void clkBtn(WebElement e) {
			 e.click();
			 
		 }
		 public static String textGet(WebElement e) {
			 String s=e.getText();
			 return s;
			 
		 }
		 public static String urlCurrent(){
			String s= driver.getCurrentUrl();
			return s;
			 
		 }
		 public static String textAttribute(WebElement e,String str) {
			 String s=e.getAttribute(str);
			 return s;
			 
		 }
  //Actions
		 public static Actions invokeActions() {
		          a=new Actions(driver);
		          return a;
		    
		 }
		 public static void elementMove(WebElement e) {
			 invokeActions();
			 a.moveToElement(e).perform();
			 
		 }
		 public static void dragandDrop(WebElement e,WebElement e1){
			 invokeActions();
			 a.dragAndDrop(e,e1).perform();
			 
		 }
		 public static void clkClick() {
			 invokeActions();
			 a.doubleClick().perform();
			 
		 }
		public static void copyClk() {
			invokeActions();
			a.contextClick().perform();
			 
		}
		
	//Robot
		public static Robot invokeRobot() throws AWTException {
			 r=new Robot();
			 return r;
		}
		public static void copyC() throws AWTException {
			invokeRobot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			
		}
		public static void paste() throws AWTException {
			invokeRobot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			
		}
		public static void enter() throws AWTException {
			invokeRobot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void tab() throws AWTException {
			invokeRobot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
		}
  //JavaScriptExecutor
		public static JavascriptExecutor invokeJavascript() {
			js=(JavascriptExecutor)driver;
			return js;
		}
		public static void textScript(WebElement e,String str) {
			invokeJavascript();
		    js.executeScript("arguments[0].setAttribute('value',"+str+")",e);
		}
		public static void clkScript(WebElement e) {
			invokeJavascript();
			js.executeScript("arguments[0].click()",e);
		}
		public static String getScript(WebElement e,String str){
			invokeJavascript();
			Object script = js.executeScript("return arguments[0].getAttribute('"+str+"')",e);
			String s=(String)script;
			return s;
			
		}
		public static void alertScript(String str) {
			invokeJavascript();
			js.executeScript("alert('"+str+"')");
		}
		public static void scroll(String cond,WebElement e) {
			js.executeScript("arguments[0].scrollIntoView("+cond+")", e);
		}
	//Alert
		public static Alert invokeAlert() {
			 a1=driver.switchTo().alert();
			 return a1;
			
		}
		public static void accpt() {
			invokeAlert();
			a1.accept();
		}
		public static void acptDismiss() {
			invokeAlert();
			a1.dismiss();
		}
		public static void textAlert(String str) {
			invokeAlert();
			a1.sendKeys(str);
		}
		public static String  textGet() {
			invokeAlert();
			String text = a1.getText();
			return text;
		}
	//frames
		public static void frmsStrng(String str) {
		 driver.switchTo().frame(str);
			
		}
		public static void frameselemnt(WebElement e) {
			driver.switchTo().frame(e);
		}
		public static void frameindex(int i) {
			driver.switchTo().frame(i);
		
		}
	//Screenshot
		public static void screenshot(String path) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
		    File src=ts.getScreenshotAs(OutputType.FILE);
		    File des=new File(path);
		    FileUtils.copyFile(src,des);
		}
	//Select
		  public static void selectIndex(WebElement e,int i) {
		    	Select s=new Select(e);
		    	s.selectByIndex(i);
			}
		    
		     public static void selectValue(WebElement e,String str) {
		    	 Select s=new Select(e);
		     	  s.selectByValue(str);
			}
		     //45
		     public static void selectVisible(WebElement e,String str) {
		    	 Select s=new Select(e);
		     	 s.selectByVisibleText(str);
			}
		     //46
		     public static boolean selectmultiple(WebElement e) {
		    	 Select s=new Select(e);
		     	   boolean mul = s.isMultiple();
		     	   return mul;
			}
		     //47
		     public static String[] selectOption(WebElement e) {
		    	 Select s=new Select(e);
		    	
		    	 List<WebElement> options = s.getOptions();
		    	 String[] str=new String[options.size()];
		    	 for(int i=0;i<options.size();i++) {
		    		 WebElement webElement = options.get(i);
		    		 String text = webElement.getText();
		    		 str[i]=text;
		    		 
		    	 }
				return str;  	 

			}
		     
		     public static String[] selectGetattr(WebElement e) {
		    	 Select s=new Select(e);
		    	
		    	 List<WebElement> options = s.getOptions();
		    	 String[] str=new String[options.size()];
		    	 for (int i = 0; i < options.size(); i++) {
		    		 WebElement webElement = options.get(i);
		    		 String text = webElement.getAttribute("value");
		    		 str[i]=text;
					
				}
		    	 return str;

			}
		     
		     public static String[] selectGetoption(WebElement e) {
		    	 Select s=new Select(e);
		    	
		    	 List<WebElement> all = s.getAllSelectedOptions();
		    	 String[] str=new String[all.size()];
		    	 for (int i = 0; i<all.size()  ; i++) {
		    		 WebElement webElement = all.get(i);
		    		 String text = webElement.getText();
		    		 str[i]=text;
					
				}
		    	 return str;
			}
		     
		     public static String[] selectGetattri(WebElement e) {
		    	 Select s=new Select(e);
		    	
		    	 List<WebElement> all = s.getAllSelectedOptions();
		    	 String[] str=new String[all.size()];
		    	 for (int i = 0; i<all.size()  ; i++) {
		    		 WebElement webElement = all.get(i);
		    		 String text = webElement.getAttribute("value");
		    		 str[i]=text;
					
				}
		    	 return str;

			}
		     
		     public static  void deselectVisible(WebElement e,String str) {
		    	 Select s=new Select(e);
		     	 s.deselectByVisibleText(str);
		     }
		     
		     public static void deselectValue(WebElement e,String str) {
		    	 Select s=new Select(e);
		     	 s.deselectByValue(str);
		     }
		     
		     public static void deselectIndex(WebElement e,int i) {
		    	 Select s=new Select(e);
		     	 s.deselectByIndex(i);
		     }
		     
		     public static void deselectAll(WebElement e,String str) {
		    	 Select s=new Select(e);
		     	 s.deselectAll();
		     }
		
		 
  //Maximize
		     public static void max() {
		    	 driver.manage().window().maximize();
		     }
		 
  //refresh
		     public static void refrsh() {
		    	 driver.navigate().refresh();
		     }
 
  //back
		     public static void bck() {
		    	 driver.navigate().back();
		     }
  //forward
		     public static void frwrd() {
		    	 driver.navigate().forward();
		     } 
  //wait
		     public static void thrdStatic(int i) throws InterruptedException {
		    	 Thread.sleep(i);
		     }
		     public static void implictWait(int time) {
		    	 driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		     }
		     public static WebDriverWait invokealertDymic(int i) {
		    	 w=new WebDriverWait(driver, i);
		    	 return w;
		    
		     }
		     public static void alertDynamic(int x) {
		    	 invokealertDymic(x);
		    	 w.until(ExpectedConditions.alertIsPresent());
		    	 
		     }
		     public static void urlDynamic(int x,String url) {
		    	 invokealertDymic(x);
		    	 w.until(ExpectedConditions.urlToBe(url));
		     }
		     public static void  elemntDynamic(int x,WebElement e) {
		    	 invokealertDymic(x);
		    	 w.until(ExpectedConditions.elementToBeSelected(e));
		     }
		     public static void clkDynamic(int x,WebElement e) {
		    	 invokealertDymic(x);
		    	 w.until(ExpectedConditions.elementToBeClickable(e));
		     }
//		     public static void fluntWait(int time,int polling) {
//		   	 FluentWait<WebDriver> fw=new FluentWait<>(driver);
//	    	 fw.withTimeout(time,TimeUnit.SECONDS).pollingEvery(polling,TimeUnit.MILLISECONDS).ignoring(Throwable.class);
//		    	
		   //  }
	//windowsHandling
		     public static String invokeWindow() {
		     	  String parid = driver.getWindowHandle();
		     	  return  parid;
		 	}
		       public static Set<String> invokewHandles( ) {
		 		parchildId = driver.getWindowHandles();
		 		 return parchildId;
		 			 	 
		 			
		 	}
		       public static void windowsChange() {
		    	   invokeWindow();
		    	   invokewHandles();
		       
		    	   for (String str : parchildId) {
		  			 if(!parid.equals(str)) {
		  				 driver.switchTo().window(str);
		       }
		    	   }
		       }
		       
		 		
	//CSS
		       public static void  cssGet(WebElement e,String str) {
		    	   e.getCssValue(str);
		       }
		       public static void cssBgcolorManual(WebElement e,String color) {
		    	   js.executeScript("arguments[0].style.backgroundcolor='"+color+"'", e);
		    	   
		       }
		       public static void cssBorder(WebElement e,String color) {
		    	   js.executeScript("arguments[0].style.border='"+color+"'", e);
		       }
		 		
		       public static void manualcolorCss(String color,String pixel,String align,WebElement e) {
		    	   js.executeScript("arguments[0].setAttribute('style','bacgroundcolor:"+color+";fontsize:"+pixel+";text-align:"+align+"')",e);
		       }
//File
		       public static String read(String path,String sheetname,int row,int cell) throws IOException {
		    	 
		    	   File f=new File(path);
		    		FileInputStream  fin=new FileInputStream(f);
		    		Workbook w=new XSSFWorkbook(fin);
		    		Sheet s = w.getSheet(sheetname);
		    		Row r = s.getRow(row);
		    		Cell c = r.getCell(cell);
		    		int type=c.getCellType();
		    		String name="";
		    		if (type==1) {
		    			  name = c.getStringCellValue();
		    		 
		    			
		    		} 
		    		else if(DateUtil.isCellDateFormatted(c)) {
		    			Date d = c.getDateCellValue();
		    			SimpleDateFormat form=new SimpleDateFormat("dd/MM/YYYY");
		    			  name = form.format(d);
		    			
		    			

		    		}
		    		else {
		    			double db = c.getNumericCellValue();
		    			long lo=(long)db;
		    		    name = String.valueOf(lo);
		    			
		    			
		    		}
		    		
		    		
		    		return name; 
		       }
		       
		       public static void write(String path,String sheet,int row,int cell1,String str) throws IOException {
		    	   File f=new File(path);
		    	   FileInputStream fin=new FileInputStream(f);
		    		Workbook w=new XSSFWorkbook(fin);
		    		Sheet s=w.getSheet(sheet);
		    		Row r = s.getRow(row);
		    		Cell c=r.createCell(cell1);
		    		c.setCellValue(str);
		    		FileOutputStream fout=new FileOutputStream(f);
		    		w.write(fout);
		    	   
		       }
		       

}



