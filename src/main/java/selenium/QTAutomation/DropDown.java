package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		WebElement dd=d.findElement(By.id("mySelect"));
		Select select=new Select(dd);
		//select by ivalue
		//select.selectByValue("pineapple");
		//select by visible text
		//select.selectByVisibleText("Banana");
		//select by index
		//select.selectByIndex(1);
		 List<WebElement> fruits = select.getOptions();
         for (int i=0;i<=3;i++)
         {
             System.out.println("List of Fruits:" +fruits.get(i).getText());
         }
     }
		
	}


