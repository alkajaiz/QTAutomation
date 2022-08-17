package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadHandling {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Widgets");
//d.findElement(By.id("image_file")).sendKeys("Users\alka.jaiswal\OneDrive - Qualitest Group\Desktop\Prisha\\Welcome.jpg");
d.findElement(By.xpath("//input[@value='Upload']")).click();
		

	}

}
