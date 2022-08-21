package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage {
	
	WebDriver driver;
	
	//this line is a parameterized constructor taking the argument of
	//WebDriver driver
	public BackgroundPage(WebDriver driver) {
		this.driver=driver;
	}


}
