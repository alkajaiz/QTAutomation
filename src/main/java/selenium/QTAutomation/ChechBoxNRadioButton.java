package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChechBoxNRadioButton {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
	WebElement greenbtn=d.findElement(By.id("green"));
	WebElement bluebtn=d.findElement(By.id("blue"));
	greenbtn.click();
	Thread.sleep(4000);
	bluebtn.click();
	d.findElement(By.id("badminton"));
	
	}

}
