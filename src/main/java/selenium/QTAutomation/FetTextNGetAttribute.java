package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FetTextNGetAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		String text=d.findElement(By.id("p1")).getText();
		System.out.println(text);
		WebElement nm= d.findElement(By.id("input1"));
		 nm.sendKeys("Alka ");
		 String text1= nm.getAttribute("value");
		System.out.print(text1);
		WebElement pw = d.findElement(By.id("input2"));
		pw.sendKeys("Jaiswal");
		String text2=pw.getAttribute("value");
		System.out.println(text2);
		 nm.clear();
		 pw.clear();
		 nm.sendKeys("Jaiswal ");
		 String text3= nm.getAttribute("value");
		System.out.print(text3);
		pw.sendKeys("Alka");
		String text4=pw.getAttribute("value");
		System.out.println(text4);
		d.close();
		 
		 
		

	}
	

}
