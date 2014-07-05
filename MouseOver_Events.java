package Multiple_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver_Events {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.virtuemart.net/");
		
		Thread.sleep(2000);
		WebElement MO=driver.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/div/ul/li[2]/a/span"));
		
		//create Object for actions
		Actions actions=new Actions(driver);
		actions.moveToElement(MO).build().perform();		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping Cart")).click();
	}

}
