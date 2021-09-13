package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class pagebase {
	
	protected WebDriver driver;	
	
	//create constructor
	public pagebase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//hello world
	}

}
