package org.test.company.Rajesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstday {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Rajesh\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement clk = driver.findElement(By.xpath("//a[@href='contact.php']"));
	Button.click();
	
}
}
