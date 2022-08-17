// Scenario: To check login functionality
  //  Given User is on mercury login page
    //When User enter the "<username>" and "<password>" on mercury tours
   // And User clicks on the login button on mercury tours
   // Then User is on mercury home page



package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	WebDriver d;
   // @Given("user is on registration page")
    public void user_is_on_registration_page() {
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://demo.guru99.com/test/newtours/");

    }

   // @When("user click on register and fill all the details")
    public void user_click_on_register_and_fill_all_the_details() {
        d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
d.findElement(By.name("firstName")).sendKeys("Naveen");
d.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Kumar");
d.findElement(By.name("phone")).sendKeys("989898989");
d.findElement(By.id("userName")).sendKeys("abcd@gmail.com");
d.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("viswash park");
d.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("New Delhi");
d.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Delhi");
d.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("111005");
  WebElement element=d.findElement(By.xpath("//select[@name=\"country\"]"));
Select select=new Select(element);
select.selectByVisibleText("INDIA");
d.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Naveen1");
d.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Naveen1");
d.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Naveen1");
    }

   // @And("user click on submit button")
    public void user_click_on_submit_button() {
        d.findElement(By.xpath("//input[@name=\"submit\"]")).click();

    }

   // @Then("user confirmed registration has been done")
    public void user_confirmed_registration_has_been_done() {
        WebElement E=d.findElement(By.xpath("//b[text()=\" Note: Your user name is Naveen1.\"]"));

          System.out.println(E.getText());
    }


}


