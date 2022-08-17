package selenium.QTAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTitle {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		String title= d.getTitle();
		System.out.println(title);
		if(title.equals("the automation zone: Mix of Basic WebElements"));
		{
			System.out.println("Title matched");
		}

	}

}
