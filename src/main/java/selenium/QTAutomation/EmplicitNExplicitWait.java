package selenium.QTAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmplicitNExplicitWait {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Widgets");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Implicit wait is implemented");
	}

}
