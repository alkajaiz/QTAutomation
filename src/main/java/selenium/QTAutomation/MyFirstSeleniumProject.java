package selenium.QTAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyFirstSeleniumProject {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.1");
	d.close();
	}
	

}
