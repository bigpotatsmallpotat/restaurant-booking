package restaurantbooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  
	//define the chrome driver
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");

      //define the driver instance
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      //navigate the browser to this url
      driver.get("http://localhost:8090/restaurant-booking/RestaurantnameServlet/dashboard");

      //browser look for link with text value "add new comment?"
      driver.findElement(By.linkText("Add New comment")).click();

      //browser look for link with text value "Experience Real-World Learning"
 
      
      driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(1)")).sendKeys("Test1 Res");
      driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(2)")).sendKeys("Test1User");
      driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(3)")).sendKeys("Comment1");
      
      driver.findElement(By.cssSelector("body > form > input[type=submit]:nth-child(4)")).click();
      
      driver.findElement(By.linkText("Click here to go to dashboard")).click();
      
      
      // going the Edit the Test object
      driver.findElement(By.cssSelector("body > div > div > table > tbody > tr > td:nth-child(4) > a:nth-child(1)")).click();
      
      //in the edit 
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input")).click();
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input")).clear();
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input")).sendKeys("TEST REST changed1");
      

      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input")).click();
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input")).clear();
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input")).sendKeys("TESTUSER changed1");
      
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input")).click();
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input")).clear();
      driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input")).sendKeys("TEST COMMENT changed1");
      
      driver.findElement(By.cssSelector("body > div > div > div > form > button")).click();
      
     
     //then delete it  
      driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > a:nth-child(2)")).click();
     
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
