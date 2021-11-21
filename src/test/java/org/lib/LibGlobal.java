package org.lib;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.record.DrawingRecordForBiffViewer;
import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	 public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) {
		// To LauchBrowser
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Invalid Browser");
		}
		return driver;
	}

	// to get Url
	public static void loadUrl(String url) {
		driver.get(url);
	}

	// to getcurrent Url
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// to get Title
	public String title() {
		String title = driver.getTitle();
		return title;
	}

	// to find the Elements
	public WebElement findLocatorbyId(String attributename) {
		WebElement element = driver.findElement(By.id(attributename));
		return element;
		
	}
	public WebElement findLocatorByName(String name) {
		WebElement txtuserName = driver.findElement(By.name(name));
		return txtuserName;
	}
	
	
	public   WebElement findlocatorbyclass(String name) {
		WebElement classname = driver.findElement(By.className(name));
		return classname;

	}
	public static WebElement findlocatorByxpath(String text) {
		WebElement xpath = driver.findElement(By.xpath(text));
		return xpath;
		
	}
	
	

	public List<WebElement> findElmts() {
		List<WebElement> list = driver.findElements(null);
		return list;
	}

	public String windHandel() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> windHandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}
	//contains
	public static  boolean contains(String value) {
		boolean b = value.contains(value);
		return b;
		
		

		

	}

	// to quit Browser
	public static void quitBrowser() {
		driver.quit();
	}

	// to close particular webpage
	public void closeWindow() {
		driver.close();
	}

	// Navigation command
	static Navigation navigate;

	public Navigation navigate() {
		navigate = driver.navigate();
		return navigate;
	}

	// Backward
	public void backBrowser() {
		navigate.back();
	}

	// Refresh Browser
	public void refreshBrowser() {
		navigate.refresh();

	}

	// Forward Browser
	public void forwardBrowser() {
		navigate.forward();
	}

	// WEBELEMENTS----->Interface
	// sendKeys
	public void setText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public  void click(WebElement c) {
		c.click();
	}

	// to getText
	public String getText(WebElement gt) {
		String text = gt.getText();
		return text;
	}

	// to Get Attribute
	public String getAttribute(WebElement ga) {
		String attribute = ga.getAttribute("value");
		return attribute;
	}
	
	public static String getAttributeValue(WebElement element,String value) {
		String text = element.getAttribute(value);
		return text;
	}

	// is displayed
	public boolean displayed(WebElement dis) {
		boolean display = dis.isDisplayed();
		return display;
	}

	// is Enabled
	public boolean enable(WebElement ena) {
		boolean enabled = ena.isEnabled();
		return enabled;
	}

	// is Selected
	public boolean selected(WebElement selc) {
		boolean selected = selc.isSelected();
		return selected;
	}

	// MouseAction
	// Action------>Class
	static Actions actions;

	public Actions MouseOverview() {
		actions = new Actions(driver);
		return actions;
	}

	public void mouseOver(WebElement mo) {
		actions.moveToElement(mo).perform();
	}

	public void dragDrop(WebElement src, WebElement des) {
		actions.dragAndDrop(src, des).perform();
	}

	public void rightClick(WebElement rc) {
		actions.contextClick(rc).perform();
	}

	public void doubleClick() {
		actions.doubleClick().perform();
	}

	// ROBOT---->Class
	public static Robot robot;

	public void keyBoard() throws AWTException {
		robot = new Robot();
	}

	// Enter
	public void pressKey() {
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public void releaseKey() {
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// Alert---->Interface

	public Alert switchToAlert() {

		Alert alert = driver.switchTo().alert();
		return alert;

	}

	public void acceptAlert() {
		switchToAlert().accept();
	}

	public void dismissAlert() {
		switchToAlert().dismiss();
	}

	public void sendText(String ad) {
		switchToAlert().sendKeys(ad);
	}

	// FRAMES----->

	public void frames(WebElement id) {
		driver.switchTo().frame(id);
	}

	public void framesInt(int index) {
		driver.switchTo().frame(index);
	}

	// Select
	static Select selects;

	public Select dropDown(WebElement element) {
		selects = new Select(element);
		return selects;
	}

	public void byIndex(int i) {
		selects.selectByIndex(i);

	}

	public void byString(String value) {
		selects.selectByValue(value);
	}

	public void visibleText(String name) {
		selects.deselectByVisibleText(name);
	}

	public void deselectIndex(int id) {
		selects.deselectByIndex(id);
	}

	public void deselectValue(String value) {
		selects.deselectByValue(value);
	}

	public void deselectVisibleText(String data) {
		selects.deselectByVisibleText(data);
	}

	public void deselect() {
		selects.deselectAll();
	}

	public List<WebElement> selectOption() {
		List<WebElement> options = selects.getOptions();
		return options;
	}

	public boolean isMultiple() {
		boolean multiple = selects.isMultiple();
		return multiple;
	}

	public static List<WebElement> getAllSelectedOption() {
		List<WebElement> selectedOptions = selects.getAllSelectedOptions();
		return selectedOptions;
	}
	//write data in cell
	public void writeDatacell(String sheetname,int rownum,int cellnum,String name) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\BaseClass\\Excel\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(rownum);
		Cell c = r.createCell(cellnum);
		c.setCellValue(name);
		
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		

	}
	// typeJs
	public void typeJs(WebElement element, String data) {
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		executer.executeScript("arguments[0].setAttribute('value''"+data+"')",driver);

	}
	public void valueByjs(WebElement element, String data) {
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		executer.executeScript("return arguments[0].setAttribute('value''"+data+"'))",driver);

	}
	

	// Excel sheet Integration
	//to GET DATA FROM EXCEL
	

	public String getDataFromExcel(String Sheet, int rowIndex, int cellIndex) throws IOException {
	
		String value = null;
		
		File location = new File(
				"C:\\Users\\welcome\\eclipse-workspace\\BaseClass\\Excel\\TestData.xlsx");

		FileInputStream stream = new FileInputStream(location);

		Workbook w = new XSSFWorkbook(stream);

		Sheet s = w.getSheet(Sheet);

		Row r = s.getRow(rowIndex);

		Cell c = r.getCell(cellIndex);

		int type = c.getCellType();

		// if it shows type==1--->string type cell
		// if it shows type==0--->Numeric and date

		if (type == 1) {

			value = c.getStringCellValue();

		}
		if (type == 0) {// the cell is Numeric or Date
			// Dateutil. is a class,,,, isCellDateFormatted is a method

			if (DateUtil.isCellDateFormatted(c)) {

				Date d = c.getDateCellValue();

				// Simple format of the Date
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(d);

			} else {// to get Numeric cell value
				double doubl = c.getNumericCellValue();

				// type casting
				long l = (long) doubl;
				value = String.valueOf(l);
				return value;

			}

		}
		return value;
		

	}

}



