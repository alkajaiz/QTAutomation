package selenium.QTAutomation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("http://www.uitestpractice.com/Students/Actions");
		WebElement dbclick= d.findElement(By.name("dblClick"));
		Actions action=new Actions(d);
		action.doubleClick(dbclick).build().perform();
		System.out.println("double click is performed");
		
	}

}
