package selenium.QTAutomation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		File sceenshot= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File("C:\Users\alka.jaiswal\OneDrive - Qualitest Group\Desktop\Prisha"));
	}

}
