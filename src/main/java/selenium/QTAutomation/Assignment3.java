package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get(" https://www.irctc.co.in ");
		d.findElement(By.xpath("//button[@type='submit']")).click();
        d.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Hyd");
        d.findElement(By.xpath("//p-autocomplete[@id='origin']//ul//li//span[contains(text(),'HYDERABAD DECAN - HYB')]")).click();
        d.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Pune");
        d.findElement(By.xpath("//p-autocomplete[@id='destination']//ul//li//span[contains(text(),'PUNE JN - PUNE')]")).click();

            WebElement el = d.findElement(By.xpath("//p-calendar[@id='jDate']//input[@type='text']"));
            el.click();
            el.clear();
            Thread.sleep(5000);
            d.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']//tr[2]//td[6]")).click();
            Thread.sleep(5000);
            d.findElement(By.xpath("//span[contains(text(),'All Classes')]")).click();
            List<WebElement> options = d.findElements(By.xpath("//p-dropdown[@id='journeyClass']//ul//li/span"));
            for (WebElement option : options)
            {
                System.out.println("Name is "+ option.getText());
                if (option.getText().equals("Sleeper (SL)"))
                {
                    option.click(); // click the desired option
                    break;
                }
}
            Thread.sleep(4000);
            WebElement checkbox=d.findElement(By.id("concessionBooking"));
            JavascriptExecutor executor = (JavascriptExecutor)d;
            executor.executeScript("arguments[0].click();", checkbox);

            d.findElement(By.xpath("//button[@type='button']//span/following-sibling::span")).click();
            Thread.sleep(4000);
            WebElement element1=d.findElement(By.xpath("//button[@label='Find Trains']"));
            JavascriptExecutor executor1 = (JavascriptExecutor)d;
            executor1.executeScript("arguments[0].click();", element1);
            Thread.sleep(8);
            WebElement  elements=d.findElement(By.xpath("(//div[@class='hidden-xs']//span)[1]"));
            System.out.println(elements.getText());

            d.close();
	}

}
