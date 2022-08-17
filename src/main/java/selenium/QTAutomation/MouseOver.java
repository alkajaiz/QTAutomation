package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.deltadental.com/");
	WebElement element= d.findElement(By.linkText("For dentists"));
	Actions action=new Actions(d);
    action.moveToElement(element).build().perform();
    Thread.sleep(4000);
    d.findElement(By.linkText("Dentist FAQ")).click();

}
}
