package selenium.QTAutomation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		String title= d.getTitle();
		System.out.println(title);
	 d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
	 d.findElement(By.id("nav-search-submit-button")).click();
	WebElement dd= d.findElement(By.id("s-result-sort-select"));
	//dd.click();
	 Select select=new Select(dd);
	 List<WebElement> features = select.getOptions();
	 //int listCount=features.size();
	 System.out.println("listcount is :"+(features.size()-1));
	 select.selectByVisibleText("Newest Arrivals");
     WebElement expectedtitle = d.findElement(By.xpath("//span[text()='Newest Arrivals']"));
     char[] result = null;
	System.out.println(result);
     boolean SelecteOption;
	if(SelecteOption=true)
     {
         System.out.println("Newest Arrivals presented");
     }
     else
     {
         System.out.println("Newest Arrivals Not presented");
     }
     d.close();
	}

}
